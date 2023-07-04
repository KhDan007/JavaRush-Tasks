package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\dan\\Desktop\\test.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\dan\\Desktop\\test.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setCountry(User.Country.UKRAINE);
            user1.setBirthDate(new Date(87654321));
            user1.setFirstName("Ben");
            user1.setMale(true);
            user1.setLastName("Black");
            javaRush.users.add(user1);

            User user2 = new User();
            user2.setCountry(User.Country.OTHER);
            user2.setBirthDate(new Date(12345678));
            user2.setFirstName("Mike Benjamin");
            user2.setMale(true);
            user2.setLastName("Tyson Lebovski");
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) {
            PrintStream writer = new PrintStream(outputStream);
            if (users.size() > 0) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate().getTime());
                    writer.println(user.isMale());
                    writer.println(user.getCountry().getDisplayName());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                User user = new User();
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                String country = reader.readLine();
                if (country.equals("Ukraine")) {
                    user.setCountry(User.Country.UKRAINE);
                } else if (country.equals("Russia")) {
                    user.setCountry(User.Country.RUSSIA);
                } else if (country.equals("Other")) {
                    user.setCountry(User.Country.OTHER);
                }
                users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return Objects.equals(users, javaRush.users);

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

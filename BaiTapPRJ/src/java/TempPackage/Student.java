/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TempPackage;

/**
 *
 * @author DELL
 */
public class Student {

        String code;
        String name;
        String gender;

        public Student() {
        }

        public Student(String code, String name, String gender) {
            this.code = code;
            this.name = name;
            this.gender = gender;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

    }

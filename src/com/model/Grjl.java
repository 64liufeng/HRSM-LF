package com.model;

public class Grjl {
    private int id;
    private String name;
    private String sex;
    private String date;
    private String place;
    private String ID_number;
    private String phone;
    private String mail;
    private String address;
    private String newAddress;
    private String prof;
    private String education;
    private String unversity;
    private String majorCourse;
    private String Professional_skills;
    private String to_date;
    private String work;
    private String industry;
    private String workAddress;
    private String salary;
    private String function;
    private String experience;
    private String evaluation;

    public Grjl() {
    }

    public Grjl(int id, String name, String sex, String date, String place,
                String ID_number, String phone, String mail, String address,
                String newAddress, String prof, String education, String unversity,
                String majorCourse, String professional_skills, String to_date, String work,
                String industry, String workAddress, String salary, String function, String experience, String evaluation) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.place = place;
        this.ID_number = ID_number;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.newAddress = newAddress;
        this.prof = prof;
        this.education = education;
        this.unversity = unversity;
        this.majorCourse = majorCourse;
        Professional_skills = professional_skills;
        this.to_date = to_date;
        this.work = work;
        this.industry = industry;
        this.workAddress = workAddress;
        this.salary = salary;
        this.function = function;
        this.experience = experience;
        this.evaluation = evaluation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getID_number() {
        return ID_number;
    }

    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUnversity() {
        return unversity;
    }

    public void setUnversity(String unversity) {
        this.unversity = unversity;
    }

    public String getMajorCourse() {
        return majorCourse;
    }

    public void setMajorCourse(String majorCourse) {
        this.majorCourse = majorCourse;
    }

    public String getProfessional_skills() {
        return Professional_skills;
    }

    public void setProfessional_skills(String professional_skills) {
        Professional_skills = professional_skills;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "GrjlService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", ID_number='" + ID_number + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", newAddress='" + newAddress + '\'' +
                ", prof='" + prof + '\'' +
                ", education='" + education + '\'' +
                ", unversity='" + unversity + '\'' +
                ", majorCourse='" + majorCourse + '\'' +
                ", Professional_skills='" + Professional_skills + '\'' +
                ", to_date='" + to_date + '\'' +
                ", work='" + work + '\'' +
                ", industry='" + industry + '\'' +
                ", workAddress='" + workAddress + '\'' +
                ", salary='" + salary + '\'' +
                ", function='" + function + '\'' +
                ", experience='" + experience + '\'' +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }
}

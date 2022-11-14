package com.inev1te.study.designpattern.behavioral.memento;

public class Original {

    private String name;

    private Integer age;

    private Boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Original(String name, Integer age, Boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Memo createMemo(){
        return new Memo(this.name,this.getAge(),this.getSex());
    }

    public void restoreMemo(Memo memo){
        this.setAge(memo.getAge());
        this.setName(memo.getName());
        this.setSex(memo.getSex());
    }

    @Override
    public String toString() {
        return "Original{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

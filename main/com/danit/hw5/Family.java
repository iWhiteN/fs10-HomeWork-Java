package com.danit.hw5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[1];
    private Pet pet;

    static {
        System.out.println("Загружается новый класс Family");
    }

    {
        System.out.println("Загружается новый экземпляр класса " + this.getClass().getSimpleName());
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;

        father.setFamily(this);
        mother.setFamily(this);
    }

    public void addChild(Human child) {
        child.setFamily(this);
        if (children[0] == null) {
            children[0] = child;
        } else {
            Human[] newChildren = new Human[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[children.length] = child;
            children = newChildren;
        }
    }

    public boolean deleteChild(int idx) {
        if (idx <= children.length - 1 && children[idx] != null) {
            Human[] newChildren = new Human[children.length - 1];
            children[idx].setFamily(null);

            for (int i = 0; i < children.length; i++) {
                if (i != idx) {
                    newChildren[i > idx ? i - 1 : i] = children[i];
                }
            }
            children = newChildren;
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        int idx = 0;
        boolean valid = false;

        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                idx = i;
                valid = true;
            }
        }

        if (valid) {
            Human[] newChildren = new Human[children.length - 1];
            children[idx].setFamily(null);

            for (int i = 0; i < children.length; i++) {
                if (i != idx) {
                    newChildren[i > idx ? i - 1 : i] = children[i];
                }
            }
            children = newChildren;
            return true;
        } else {
            return false;
        }

    }


    public int countFamily() {
        return children.length + 2;
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return mother + "\n" +
                father + "\n" +
                Arrays.toString(children) + "\n" +
                pet;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + father.hashCode();
        result = 31 * result + mother.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return father.equals(family.father) && mother.equals(family.mother);
    }
}

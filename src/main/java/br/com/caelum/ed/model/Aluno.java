package br.com.caelum.ed.model;

import java.util.Objects;

public class Object {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                '}';
    }



    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Object aluno = (Object) o;
        return Objects.equals(name, aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

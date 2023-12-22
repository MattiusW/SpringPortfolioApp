package com.mateuszwalczyk.production.model;

import jakarta.persistence.Entity;

import java.util.concurrent.TimeUnit;

@Entity
public class Machine {

    private Long id;
    private String name;
    private int durability;
    private int quantity;
    private TimeUnit workTime;

    private Machine(){

    }

    private Machine(Long id, String name, int durability, int quantity, TimeUnit workTime){
        this.id = id;
        this.name = name;
        this.durability = durability;
        this.quantity = quantity;
        this.workTime = workTime;
    }

    public static class MachineBuilder {
        private Long id;
        private String name;
        private int durability;
        private int quantity;
        private TimeUnit workTime;

        public MachineBuilder(){

        }

        public MachineBuilder setId(Long id){
            this.id = id;
            return this;
        }

        public MachineBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MachineBuilder setDurability(int durability) {
            this.durability = durability;
            return this;
        }

        public MachineBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public MachineBuilder setWorkTime(TimeUnit workTime) {
            this.workTime = workTime;
            return this;
        }

        public Machine buildMachine() {
            return new Machine(id, name, durability, quantity, workTime);
        }
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public int getQuantity() {
        return quantity;
    }

    public TimeUnit getWorkTime() {
        return workTime;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + " | machine: " + getName() + " | durability" + getDurability() + " | quantity" + getQuantity() +
                " | work time: " + getWorkTime();
    }
}

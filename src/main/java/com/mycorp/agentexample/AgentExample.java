package com.mycorp.agentexample;

public class AgentExample {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            process();
        }

        Thread.sleep(100000000L);
    }

    public static void process() {
        System.out.println(">>>>> process method");
    }

}

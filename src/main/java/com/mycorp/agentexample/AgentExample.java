package com.mycorp.agentexample;

public class AgentExample {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            process();
        }

        Thread.sleep(Long.MAX_VALUE);
    }

    public static void process() {
        System.out.println(">>>>> process method");
    }

}

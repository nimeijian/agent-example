package com.mycorp.agentexample;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

public class AttachExample {
    public static void main(String[] args) throws Exception {
        for (VirtualMachineDescriptor virtualMachineDescriptor : VirtualMachine.list()) {
            // 针对指定名称的JVM实例
            if (virtualMachineDescriptor.displayName().equals("com.mycorp.agentexample.AgentExample")) {
//                System.out.println("将对该进程的vm进行增强：com.mycorp.agentexample.AgentExample的vm进程, pid=" + virtualMachineDescriptor.id());
                // attach到新JVM
                VirtualMachine vm = VirtualMachine.attach(virtualMachineDescriptor);
                // 加载agentmain所在的jar包
                vm.loadAgent("/Users/10028625/code2/agent/target/agent-0.0.1-SNAPSHOT-jar-with-dependencies.jar");
                // detach
                vm.detach();
            }
        }
    }
}

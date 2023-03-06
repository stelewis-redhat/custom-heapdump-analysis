package net.stelewis.heapdump;

import org.netbeans.lib.profiler.heap.Heap;
import org.netbeans.lib.profiler.heap.HeapFactory;
import org.netbeans.lib.profiler.heap.JavaClass;

import java.io.File;
import java.io.IOException;

public class CustomHeapdumpAnalysis {

    public static void main(String[] args) throws IOException {
        File file = new File("basic-programmatic.hprof");
        System.out.println(file.length());

        Heap heap = HeapFactory.createHeap(file);

        JavaClass mainClass = heap.getJavaClassByName("net.stelewis.heapdump.BasicProgrammatic");
        System.out.println(mainClass.getName());

//        List biggestObjects = heap.getBiggestObjectsByRetainedSize(1);
//
//        Instance instance = (Instance) biggestObjects.get(0);
//
//        System.out.println("Hi");
    }
}

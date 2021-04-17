# Multithreading in Java

* Multithreading in Java is a process of executing multiple threads simultaneously.
* A thread is a lightweight sub-process, the smallest unit of processing. It has a separate path of execution.
* Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

## Advantages of Java Multithreading
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
2) You can perform many operations together, so it saves time.
3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

## Multitasking
Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:

* Process-based Multitasking (Multiprocessing)
* Thread-based Multitasking (Multithreading)

| Multiprocessing     | Multithreading |
| -----------  | ----------- |
| Each process allocates a separate memory area.   | Threads share the same address space.        |
| A process is heavyweight.    | A thread is lightweight.       |
| Cost of communication between the process is high.      | Cost of communication between the thread is low.       |

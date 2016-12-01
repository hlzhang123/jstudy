/**
 *  同一个实例 多个线程调用
 *
 * [1]静态方法和实例方法的区别是静态方法只能引用静态变量，静态方法通过类名来调用，实例方法通过对象实例来调用
   [2]每个线程都有自己的线程栈，栈与线程同时创建，每一个虚拟机线程都有自己的程序计数器PC，在任何时刻，一个虚拟机线程只会执行一个方法的代码，这个方法称为该线程的当前方法，如果这个方法不是native的，程序计数器就保存虚拟机正在执行的字节码指令的地址。
   [3]线程调用方法的时候会创建栈帧，用于保存局部变量表和操作数栈以及指向该类常量池的引用
   [4]当你第一个线程执行到方法的第8行，第二个线程执行到第二行，虽然是同一个方法，但是不同线程在调用，程序计数器的值是不一样的，操作这两个线程不会相互影响（假设不存在访问共享变量的情况）
 * @author shoumiao_yao
 * @date 2016-12-01
 */
package com.jxnu.pattern.oneInstanceMultiThread;
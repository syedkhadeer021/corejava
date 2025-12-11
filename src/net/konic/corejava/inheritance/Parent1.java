package net.konic.corejava.inheritance;

public class Parent1 {

    public void m1() {
        System.out.println("Parent m1");
    }

    protected Object m2() {
        System.out.println("Parent m2");
        return "Parent";
    }

    private void m3() {
        // Only accessible inside Parent1
    }

    public static void m4() {
        System.out.println("Parent static");
    }

    public final void m5() {
        System.out.println("Parent final");
    }
}

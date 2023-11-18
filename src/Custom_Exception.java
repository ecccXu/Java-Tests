/*
    自定义两个异常，
    一个为EmptyStackException，其默认的异常信息是“堆栈空！”；
    另一个为FullStackException，其默认的异常信息是“堆栈满！”。
 */

// 自定义EmptyStackException异常
class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("堆栈空！");
    }
}

// 自定义FullStackException异常
class FullStackException extends Exception {
    public FullStackException() {
        super("堆栈满！");
    }
}

/*
    在上述代码中，我们分别继承了Java中的Exception类，并在构造函数中调用了父类的构造函数，
    传入了默认的异常信息。这样，当我们在程序中抛出这两个异常时，就可以直接使用默认的异常信息。

    如果需要在抛出异常时自定义异常信息，可以在构造函数中添加一个String类型的参数，用于传入自定义的异常信息。
 */

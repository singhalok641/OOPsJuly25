package org.example.libraryManagement;

public interface Lendable {
    public boolean lend(User user);
    public void returnBook(User user);
    public boolean isAvailable();
}

/*
Explain the purpose of interfaces and how they enable compile-time polymorphism.

At its core, this interface establishes a "can-do" relationship. It doesn't represent an object itself;
instead, it defines the behavior that any object must have if it wants to be considered "lendable."
It answers the question, "What can a lendable object do?"

It can be lent (lend).

It can be returned (returnBook).

Its availability can be checked (isAvailable).

Any class, regardless of its place in the class hierarchy, can promise to fulfill this contract by using
the implements keyword. For example, in a library system, both a Book and a DVD are fundamentally different things,
but both can be lent out.
 */

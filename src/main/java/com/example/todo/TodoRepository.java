package com.example.todo;

import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodos();
     Movie addTodo(Todo todo);

    Todo getTodoById(int todoId);

    Todo updateTodo(int todoId, Todo todo);

    void deleteTodo(int TodoId);
}
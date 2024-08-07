# Spring Intro

1. Whenever you perform operations with the DB, don't forget about transaction and to close connection after you're done.
1. Keep your code clean (don't push commented code, remember about empty lines in the end of the file).
1. Don't add dependencies, that you don't currently use, it's a bad practice.
1. Use `try-finally` when you work with transaction and `try-with-resources` with read operations.
1. Check if you've put correct access modifiers everywhere.
1. What is better: setter, constructor, or field injection? Think why.
1. You should write `@Autowired` annotation above the constructor everywhere or nowhere in all your classes. The code style over your project should be uniform.
1. Use informative variable names.

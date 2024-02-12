package hometask;
/**
 * Интерфейс с методом, не принимающим аргументы и возвращающим результат (аналог Supplier):
 */
@FunctionalInterface
interface Provider<R> {
    R provide();
}
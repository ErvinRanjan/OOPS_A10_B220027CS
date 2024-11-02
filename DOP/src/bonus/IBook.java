package bonus;

public sealed interface IBook<T> permits Comic,TextBook,Fiction{
	T printName();
}

interface Desctiptor<T>{
    fun getDescription(description: T)
}

class BookDescriptor: Desctiptor<Book>{
    override fun getDescription(description: Book) {
        println(description.data)
    }
}

class NewspaperDescriptor: Desctiptor<Newspaper>{
    override fun getDescription(description: Newspaper) {
        println(description.data)
    }
}

class VideoDescriptor: Desctiptor<Video>{
    override fun getDescription(description: Video) {
        println(description.data)
    }

}

fun main(args: Array<String>) {
    val bookDescriptor = BookDescriptor()
    val book = Book("book_1","author_1")
    bookDescriptor.getDescription(book)

    val newspaperDescriptor = NewspaperDescriptor()
    val newspaper = Newspaper("newspaper_1",11)
    newspaperDescriptor.getDescription(newspaper)

}
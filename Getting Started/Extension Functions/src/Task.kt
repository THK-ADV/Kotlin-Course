fun String.invertCase() = this.map {
    if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase()
}.joinToString(separator = "")
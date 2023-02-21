package special_classes.sealed.error

import java.io.File

class FileReadError(val file: File) : IOError()
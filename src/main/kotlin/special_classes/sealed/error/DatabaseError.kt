package special_classes.sealed.error

import javax.sql.DataSource

class DatabaseError(val source: DataSource): IOError()
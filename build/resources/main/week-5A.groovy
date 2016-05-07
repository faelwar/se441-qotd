databaseChangeLog = {

<<<<<<< HEAD
    changeSet(author: "Rafael (generated)", id: "1461960710217-1") {
=======
    changeSet(author: "Rafael (generated)", id: "1461944303612-1") {
>>>>>>> refs/remotes/origin/master
        createTable(tableName: "quote") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "quotePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "text", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}

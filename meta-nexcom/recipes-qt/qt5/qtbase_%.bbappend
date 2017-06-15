PACKAGECONFIG += "sql-sqlite nofreetype noqpa"
PACKAGECONFIG[noqpa] = "-no-qpa-platform-guard"
PACKAGECONFIG_append = " sql-sqlite sql-sqlite2 "

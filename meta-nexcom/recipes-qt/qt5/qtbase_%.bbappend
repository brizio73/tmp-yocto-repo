PACKAGECONFIG += "sql-sqlite nofreetype noqpa"

PACKAGECONFIG[gui] = "-gui,-no-gui"
PACKAGECONFIG[eglfs] = "-eglfs,-no-eglfs"
PACKAGECONFIG[gif] = ",-no-gif"
PACKAGECONFIG[nofreetype] = "-no-freetype"
PACKAGECONFIG[noqpa] = "-no-qpa-platform-guard"

PACKAGECONFIG_append = " sql-sqlite sql-sqlite2 "

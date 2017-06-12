PACKAGECONFIG[noqpa] = "-no-qpa-platform-guard"
PACKAGECONFIG[gui] = "-gui,-no-gui"
PACKAGECONFIG[eglfs] = "-eglfs,-no-eglfs"
PACKAGECONFIG[gif] = ",-no-gif"
PACKAGECONFIG[nofreetype] = "-no-freetype"

PACKAGECONFIG_append = " sql-sqlite sql-sqlite2 "

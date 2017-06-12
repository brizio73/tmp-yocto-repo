################
################

if [ -d "/opt/tpkg/00_tpkg/bin" ]; then
    PATH="/opt/tpkg/00_tpkg/bin:$PATH"
fi

if [ -d "/opt/tpkg/01_monitrc/bin" ]; then
    PATH="/opt/tpkg/01_monitrc/bin:$PATH"
fi
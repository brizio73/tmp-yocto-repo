DESCRIPTION = "colorama" 
SECTION = "devel/python" 
LICENSE = "BSD" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
HOMEPAGE = "http://alastairs-place.net/projects/netifaces/" 
DEPENDS = "python" 

SRC_URI = "https://pypi.python.org/packages/source/c/colorama/colorama-0.2.5.tar.gz"
SRC_URI[md5sum] = "308c6e38917bdbfc4d3b0783c614897d"
SRC_URI[sha256sum] = "55bad9c74fbda47c558d581e287cfd9bfff48f196caedcff76bf2fb17149b80b"

inherit distutils

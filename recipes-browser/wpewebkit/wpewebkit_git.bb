require wpewebkit.inc

SRC_URI = " \
    git://github.com/WebKit/WebKit;protocol=https;branch=webkitglib/2.52 \
    file://0001-Workaround-compiler-bug-for-inlining.patch \
"
SRCREV = "c15b62ea8c6be03806500f06a5bae0ec63d5b682"
S = "${WORKDIR}/git"
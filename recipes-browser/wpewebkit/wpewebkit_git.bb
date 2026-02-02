require wpewebkit.inc

SRC_URI = " \
    git://github.com/WebKit/WebKit;protocol=https;branch=main \
    file://0001-Workaround-compiler-bug-for-inlining.patch \
"
SRCREV = "ff71a3d8c503a022bdcc94955a78a8d9aa7bbab3"
S = "${WORKDIR}/git"
SUMMARY = "Qt wrapper for BlueZ 5 DBus API, with partial support for BlueZ 4 backends"
HOMEPAGE = "https://github.com/sailfishos/libsailfishkeyprovider"
LICENSE = "LGPL-2.1+"
LIC_FILES_CHKSUM = "file://../license.lgpl;md5=cf3f442f331daf906e35a3e770768003"

SRC_URI = "git://github.com/sailfishos/libsailfishkeyprovider.git;protocol=https"
SRCREV = "ebe72a1d6e631bbb9cb3814ed2599d5910930008"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git/lib"
B = "${S}"

DEPENDS += "qtbase"
inherit qmake5

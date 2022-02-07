# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Permissions definitions for Sailjail"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=5373835f6c082e9d709e6e51a596adb5"

SRC_URI = "git://github.com/sailfishos/sailjail-permissions;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
EXTRA_QMAKEVARS_CONFIGURE += "${PACKAGECONFIG_CONFARGS}"
DEPENDS="qtdeclarative-native qtbase"
# NOTE: spec file indicates the license may be "BSD"
inherit qmake5


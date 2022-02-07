# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Qt embeddings for Gecko"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=48a3fe23ed1353e0995dadfda05ffdb6"

SRC_URI = "git://github.com/sailfishos/qtmozembed;protocol=https;branch=master"

# Modify these as desired
PV = "1.53.9+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative"
# NOTE: spec file indicates the license may be "MPLv2.0"
inherit qmake5


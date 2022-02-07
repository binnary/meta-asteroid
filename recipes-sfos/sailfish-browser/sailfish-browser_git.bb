# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Sailfish Browser"
HOMEPAGE = "https://github.com/sailfishos/sailfish-browser"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.html
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE.html;md5=c506bfc550bda728debbfd0584e36da6"

SRC_URI = "git://github.com/sailfishos/sailfish-browser;protocol=https;branch=master"

# Modify these as desired
PV = "2.1.0+git${SRCPV}"
SRCREV = "47c2fc7242b618e12c42e43cfa8aa0cb8d281548"

S = "${WORKDIR}/git"

DEPENDS = "qtbase qtdeclarative mlite"
# NOTE: spec file indicates the license may be "MPLv2.0"
inherit qmake5
#inherit package_rpm

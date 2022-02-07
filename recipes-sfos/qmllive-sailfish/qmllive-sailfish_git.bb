# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Qt QmlLive extensions for Sailfish OS application development"
# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/sailfishos/qmllive-sailfish;protocol=https;branch=master"

# Modify these as desired
PV = "0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
inherit qmake5
B = "${S}"
DEPENDS +="qtdeclarative qtbase libsailfishapp  qmllive"
# NOTE: spec file indicates the license may be "GPLv3+ and BSD"


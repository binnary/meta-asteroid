# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Notifications plugin for Qt Messaging Framework (QMF)"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.BSD
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=caa037e0975ee5862b72644673e7590c"

SRC_URI = "git://github.com/sailfishos/qmf-notifications-plugin;protocol=https;branch=master"

# Modify these as desired
PV = "0.2.7+git${SRCPV}"
SRCREV = "db4ed33c33c27c68bda2328987f29d7c9347ba9f"

S = "${WORKDIR}/git"

# NOTE: spec file indicates the license may be "BSD"
inherit qmake5


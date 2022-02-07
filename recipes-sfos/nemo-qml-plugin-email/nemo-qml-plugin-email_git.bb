# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Email plugin for Nemo Mobile"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.LGPL
#   LICENSE.BSD
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4cbe8f996e01de5a6c3624316042d371 \
                    file://LICENSE.ASL2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://LICENSE.BSD;md5=caa037e0975ee5862b72644673e7590c"

SRC_URI = "git://github.com/sailfishos/nemo-qml-plugin-email;protocol=https;branch=master"

# Modify these as desired
PV = "0.6.22+git${SRCPV}"
SRCREV = "48e065498bc1b567c6cb86d9c2b18de425c6509c"

S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative qtbase"
# NOTE: spec file indicates the license may be "ASL 2.0 and LGPLv2+ and BSD"
inherit qmake5


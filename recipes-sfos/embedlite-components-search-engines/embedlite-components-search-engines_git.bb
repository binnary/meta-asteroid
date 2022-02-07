# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "EmbedLite Components Search Engines"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=e879eaad64aab8e1f8e63e298f5cea28"

SRC_URI = "gitsm://github.com/sailfishos/embedlite-components;protocol=https;branch=master"

# Modify these as desired
PV = "0.0.1+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS = "qtdeclarative qtbase"
# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
# NOTE: spec file indicates the license may be "MPLv2"
#inherit autotools
inherit qmake5

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
FILES:${PN} = "/usr/lib/mozembedlite/chrome/embedlite/content/search-plugins/ "


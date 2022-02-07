# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Access control over D-Bus"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6082f02425c6eaa5eba3813ba775c91 \
                    file://debian/copyright;md5=a6082f02425c6eaa5eba3813ba775c91"

SRC_URI = "git://github.com/sailfishos/libdbusaccess;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.16+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS += "glib-2.0 gnutls libglibutil bison-native flex-native  pkgconfig-native"

# NOTE: spec file indicates the license may be "BSD"
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

#do_install () {
#	# This is a guess; additional arguments may be required
#	oe_runmake install
#}
do_install:append() {
    mkdir -p ${D}/usr/lib/pkgconfig
    mkdir -p ${D}/usr/include
    cp build/libdbusaccess.pc  ${D}/usr/lib/pkgconfig/libdbusaccess.pc
    cp build/release/libdbusaccess.a         ${D}/usr/lib/
    cp build/release/libdbusaccess.so.1      ${D}/usr/lib/
    cp build/release/libdbusaccess.so.1.0.16 ${D}/usr/lib/
    cp include/*                             ${D}/usr/include/
}
FILES:${PN} += "/usr/lib/pkgconfig /usr/lib/lib* /usr/include"
FILES:${PN}-dev ="/usr/include /usr/lib/ /usr/lib/pkgconfig"

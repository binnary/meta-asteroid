# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Qt Messaging Framework (QMF)"
# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/sailfishos/qmf;protocol=https;branch=master"

# Modify these as desired
PV = "4.0.0+git${SRCPV}"
SRCREV = "b2fbe970283b109a6801200694bfd5020555b806"

S = "${WORKDIR}/git/qmf-4.0.0/"
DEPENDS += "qtdeclarative qtbase libaccounts-qt5 libsignon-qt5"
# NOTE: spec file indicates the license may be "LGPLv2.1 with exception or GPLv3"
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.
inherit qmake5
do_configure:prepend (){
     rm -rf ${WORKDIR}/git/qmf-4.0.0
     tar -xvf ${WORKDIR}/git/qmf-4.0.0.tar.bz2 -C ${WORKDIR}/git/ 
     cd ${WORKDIR}/git/qmf-4.0.0/
     for i in `ls ../*.patch`
     do
        patch -p1 < $i
     done
     cd -
	# Specify any needed configure commands here
}

#do_compile () {
#	# You will almost certainly need to add additional arguments here
##	oe_runmake
# #  rpmbuild -ba qmf-qt5.spec
#}
#
#do_install () {
#	# NOTE: unable to determine what to put here - there is a Makefile but no
#	# target named "install", so you will need to define this yourself
#	:
#}


# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Nemo QML contacts library"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.BSD
LICENSE = "CLOSED"

SRC_URI = "git://github.com/sailfishos/nemo-qml-plugin-contacts;protocol=https;branch=master"

# Modify these as desired
PV = "0.3.22+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative qtbase qtpim qtcontacts-sqlite-qt5-extensions libmlocale mce mlite libaccounts-qt5 libphonenumber qttools-native qtdeclarative-native"
# NOTE: spec file indicates the license may be "BSD"
inherit qmake5
B="${S}"
FILES:${PN} ="/opt/tests/nemo-qml-plugins-qt5/contacts/ \
  /usr/bin/ \
  /usr/lib/ \ 
  /usr/share/translations/nemo-qml-plugin-contacts_eng_en.qm \
  /usr/share/translations/source/nemo-qml-plugin-contacts.ts \
  /usr/lib/qml/org/nemomobile/contacts/ "


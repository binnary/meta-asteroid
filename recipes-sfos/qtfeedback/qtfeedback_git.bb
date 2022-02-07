# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.FDL
#   LICENSE.GPL3-EXCEPT
#   LGPL_EXCEPTION.txt
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPLv3 & LGPLv3 & Unknown & GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE.LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
                    file://LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
                    file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654"

SRC_URI = "git://github.com/qt/qtfeedback;protocol=https;branch=master"
DEPENDS += "qtdeclarative qtbase"
#DEPENDS += "qtdeclarative kcalcore mkcal libaccounts-qt5"
# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit qmake5
#  /usr/lib/libQt5Feedback.prl
#  /usr/lib/mkspecs
#  /usr/lib/mkspecs/modules
#  /usr/lib/mkspecs/modules/qt_lib_feedback_private.pri
#  /usr/lib/mkspecs/modules/qt_lib_feedback.pri
#  /usr/lib/qml/QtFeedback/plugins.qmltypes
#  /usr/lib/qml/QtFeedback/libdeclarative_feedback.so
#  /usr/lib/qml/QtFeedback/qmldir
#
#FILES:${PN}-dbg += "/opt /usr/lib/qml/org/nemomobile/calendar/.debug"
FILES:${PN} += "/usr/lib/qml/QtFeedback/* /usr/lib/libQt5Feedback.prl /usr/lib/mkspecs/modules/*"

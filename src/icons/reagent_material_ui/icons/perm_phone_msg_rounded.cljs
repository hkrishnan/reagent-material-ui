(ns reagent-material-ui.icons.perm-phone-msg-rounded
  "Imports @material-ui/icons/PermPhoneMsgRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-phone-msg-rounded (create-svg-icon (e "path" #js {"d" "M20 3h-7c-.55 0-1 .45-1 1v9l3-3h5c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zm-.77 12.26-2.54-.29c-.61-.07-1.21.14-1.64.57l-1.84 1.84c-2.83-1.44-5.15-3.75-6.59-6.59l1.85-1.85c.43-.43.64-1.03.57-1.64l-.29-2.52c-.12-1.01-.97-1.77-1.99-1.77H5.03c-1.13 0-2.07.94-2 2.07.53 8.54 7.36 15.36 15.89 15.89 1.13.07 2.07-.87 2.07-2v-1.73c.01-1.01-.75-1.86-1.76-1.98z"})
                                             "PermPhoneMsgRounded"))

(ns reagent-material-ui.icons.mark-as-unread-rounded
  "Imports @material-ui/icons/MarkAsUnreadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mark-as-unread-rounded (create-svg-icon [(e "path" #js {"d" "M16.23 7h2.6c-.06-.47-.36-.94-.79-1.17L11.4 2.45c-.56-.29-1.23-.29-1.8-.01L2.8 5.83c-.48.26-.8.81-.8 1.34V15c0 1.1.9 2 2 2V7.4L10.5 4l5.73 3z"}) (e "path" #js {"d" "M20 8H7c-1.1 0-2 .9-2 2v9c0 1.1.9 2 2 2h13c1.1 0 2-.9 2-2v-9c0-1.1-.9-2-2-2zm0 3.46c0 .33-.19.64-.48.79l-5.61 2.88c-.25.13-.56.13-.81 0l-5.61-2.88c-.3-.15-.49-.46-.49-.79 0-.67.7-1.1 1.3-.79l5.2 2.67 5.2-2.67c.6-.31 1.3.12 1.3.79z"})]
                                             "MarkAsUnreadRounded"))

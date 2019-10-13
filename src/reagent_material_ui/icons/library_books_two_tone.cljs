(ns reagent-material-ui.icons.library-books-two-tone
  "Imports @material-ui/icons/LibraryBooksTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def library-books-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M8 16h12V4H8v12zm2-10h8v2h-8V6zm0 3h8v2h-8V9zm0 3h4v2h-4v-2z", "opacity" ".3"}) (e "path" #js {"d" "M4 22h14v-2H4V6H2v14c0 1.1.9 2 2 2zM6 4v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2zm14 12H8V4h12v12zM10 9h8v2h-8zm0 3h4v2h-4zm0-6h8v2h-8z"}))
                                             "LibraryBooksTwoTone"))
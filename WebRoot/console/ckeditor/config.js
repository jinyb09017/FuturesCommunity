/**
 * @license Copyright (c) 2003-2013, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.html or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	config.toolbar = 'Full';
	config.width = 500;
	config.toolbarCanCollapse = true;


    config.toolbar_Full = [


                           ['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],




                           ['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],





                          
                            ['TextColor','BGColor']

                        ];
};

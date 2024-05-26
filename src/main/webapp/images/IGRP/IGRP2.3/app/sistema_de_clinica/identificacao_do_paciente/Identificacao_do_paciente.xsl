<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/IGRP.daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><link type="text/css" rel="stylesheet" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link type="text/css" rel="stylesheet" href="{$path}/core/igrp/process/process.css?v={$version}"/><link type="text/css" rel="stylesheet" href="{$path}/plugins/view/igrp.view.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><xsl:call-template name="dynamic-tmpl-start"/><div class="row " id="row-bee77c74"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/form_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/nome"><div class="form-group col-sm-3   gen-fields-holder" item-name="nome" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/nome"/><label for="{rows/content/form_1/fields/nome/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/nome/@name}" name="{rows/content/form_1/fields/nome/@name}" disablehtml="true" placeholder="{rows/content/form_1/fields/nome/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/data_nascimento"><div class="form-group col-sm-3  gen-date-picker-wrapper gen-fields-holder" item-name="data_nascimento" item-type="date"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/data_nascimento"/><label for="{rows/content/form_1/fields/data_nascimento/@name}"><span><xsl:value-of select="rows/content/form_1/fields/data_nascimento/label"/></span></label><div class="input-group"><input type="text" value="{rows/content/form_1/fields/data_nascimento/value}" datefield="true" disableWeekends="false" disabledBeforetoday="false" data-range="false" class="form-control gen-date-picker " id="{rows/content/form_1/fields/data_nascimento/@name}" name="{rows/content/form_1/fields/data_nascimento/@name}" format="" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/data_nascimento"/></xsl:call-template></input><span class="datepicker-clear fa fa-times"/><span class="input-group-btn gen-date-icon"><a class="btn btn-primary"><i class="fa fa-calendar"/></a></span></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/tipo_documento_"><div class="col-sm-3 form-group  gen-fields-holder" item-name="tipo_documento_" item-type="select"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/tipo_documento_"/><label for="{rows/content/form_1/fields/tipo_documento_/@name}"><xsl:value-of select="rows/content/form_1/fields/tipo_documento_/label"/></label><select class="form-control select2  " id="{rows/content/form_1/fields/tipo_documento_/@name}" name="{rows/content/form_1/fields/tipo_documento_/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/tipo_documento_"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/tipo_documento_/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/numero_documento"><div class="form-group col-sm-3   gen-fields-holder" item-name="numero_documento" item-type="number"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/numero_documento"/><label for="{rows/content/form_1/fields/numero_documento/@name}"><span><xsl:value-of select="rows/content/form_1/fields/numero_documento/label"/></span></label><input type="number" value="{rows/content/form_1/fields/numero_documento/value}" min="" max="" class="form-control  " id="{rows/content/form_1/fields/numero_documento/@name}" name="{rows/content/form_1/fields/numero_documento/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/numero_documento"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/informacao_adicional"><div item-name="informacao_adicional" class="box-head subtitle gen-fields-holder" text-color="1"><span><xsl:value-of select="rows/content/form_1/fields/informacao_adicional/label"/></span></div></xsl:if><xsl:if test="rows/content/form_1/fields/primeira_consulta_"><div class="col-sm-12  gen-fields-holder" item-name="primeira_consulta_" item-type="radiolist"><div class="form-group radiolist clear"><label><span><xsl:value-of select="rows/content/form_1/fields/primeira_consulta_/label"/></span></label><xsl:for-each select="rows/content/form_1/fields/primeira_consulta_/list/option"><div class="radio radiolist col-md-1"><label style="font-weight: normal !important;" class="container-box"><span><xsl:value-of select="text"/></span><input type="radio" name="{../../@name}" value="{value}" class="radiolist " label="{text}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="//rows/content/form_1/fields/primeira_consulta_"/></xsl:call-template><xsl:if test="@selected='true'"><xsl:attribute name="checked">checked</xsl:attribute></xsl:if></input><span class="radiomark"/></label></div></xsl:for-each></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/data_adicional"><div class="form-group col-sm-7  gen-date-picker-wrapper gen-fields-holder" item-name="data_adicional" item-type="date"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/data_adicional"/><label for="{rows/content/form_1/fields/data_adicional/@name}"><span><xsl:value-of select="rows/content/form_1/fields/data_adicional/label"/></span></label><div class="input-group"><input type="text" value="{rows/content/form_1/fields/data_adicional/value}" datefield="true" disableWeekends="false" disabledBeforetoday="false" data-range="false" class="form-control gen-date-picker " id="{rows/content/form_1/fields/data_adicional/@name}" name="{rows/content/form_1/fields/data_adicional/@name}" format="" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/data_adicional"/></xsl:call-template></input><span class="datepicker-clear fa fa-times"/><span class="input-group-btn gen-date-icon"><a class="btn btn-primary"><i class="fa fa-calendar"/></a></span></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/nome_de_mae"><div class="form-group col-sm-6   gen-fields-holder" item-name="nome_de_mae" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/nome_de_mae"/><label for="{rows/content/form_1/fields/nome_de_mae/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome_de_mae/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome_de_mae/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/nome_de_mae/@name}" name="{rows/content/form_1/fields/nome_de_mae/@name}" disablehtml="true" placeholder="{rows/content/form_1/fields/nome_de_mae/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome_de_mae"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/nome_de_pai"><div class="form-group col-sm-6   gen-fields-holder" item-name="nome_de_pai" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/nome_de_pai"/><label for="{rows/content/form_1/fields/nome_de_pai/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome_de_pai/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome_de_pai/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/nome_de_pai/@name}" name="{rows/content/form_1/fields/nome_de_pai/@name}" disablehtml="true" placeholder="{rows/content/form_1/fields/nome_de_pai/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome_de_pai"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/tipo_documento"><div class="col-sm-6 form-group  gen-fields-holder" item-name="tipo_documento" item-type="select"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/form_1/fields/tipo_documento"/><label for="{rows/content/form_1/fields/tipo_documento/@name}"><xsl:value-of select="rows/content/form_1/fields/tipo_documento/label"/></label><select class="form-control select2  " id="{rows/content/form_1/fields/tipo_documento/@name}" name="{rows/content/form_1/fields/tipo_documento/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/tipo_documento"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/tipo_documento/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div><xsl:call-template name="dynamic-tmpl-end"/></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/jquery.inputmask.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/igrp.inputmask.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/daterangepicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/IGRP.daterangepicker.config.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/locale/dp.locale.pt.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-process-utils.tmpl.xsl?v=24"/></xsl:stylesheet>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/view/igrp.view.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/IGRP.daterangepicker.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-e13e18e7"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/novo_utilizador"><div class="form-group col-sm-12  gen-fields-holder" item-name="novo_utilizador" item-type="lookup"><label for="{rows/content/form_1/fields/novo_utilizador/@name}"><xsl:value-of select="rows/content/form_1/fields/novo_utilizador/label"/></label><div class="input-group"><input type="text" value="{rows/content/form_1/fields/novo_utilizador/value}" class="form-control gen-lookup " id="form_1_novo_utilizador" name="{rows/content/form_1/fields/novo_utilizador/@name}" maxlength="255"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/novo_utilizador"/></xsl:call-template></input><xsl:call-template name="lookup-tool"><xsl:with-param name="page" select="rows/page"/><xsl:with-param name="ad_hoc" select="'1'"/><xsl:with-param name="action" select="'LOOKUP'"/><xsl:with-param name="name" select="rows/content/form_1/fields/novo_utilizador/@name"/><xsl:with-param name="js_lookup" select="rows/content/form_1/fields/novo_utilizador/lookup"/><xsl:with-param name="input-id" select="'form_1_novo_utilizador'"/><xsl:with-param name="btnClass" select="'primary'"/></xsl:call-template></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/email_do_utilizador"><div class="form-group col-sm-12   gen-fields-holder" item-name="email_do_utilizador" item-type="text"><label for="{rows/content/form_1/fields/email_do_utilizador/@name}"><span><xsl:value-of select="rows/content/form_1/fields/email_do_utilizador/label"/></span></label><input type="text" value="{rows/content/form_1/fields/email_do_utilizador/value}" class="form-control  " id="{rows/content/form_1/fields/email_do_utilizador/@name}" name="{rows/content/form_1/fields/email_do_utilizador/@name}" readonly="readonly" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/email_do_utilizador/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/email_do_utilizador"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if><xsl:if test="rows/content/view_1"><div class="box clearfix view-block gen-container-item " has-img="false" template="default" item-separator-border="false" gen-class="" item-name="view_1"><div class="box-body"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/view_1/fields"/><xsl:if test="rows/content/view_1/fields/view_1_img"><img src="{rows/content/view_1/fields/view_1_img/value}"/></xsl:if><div class="view-body clearfix "><xsl:if test="rows/content/view_1/fields/detalhes_de_processo"><div class="view-item view-separator gen-fields-holder" item-name="detalhes_de_processo"><span class="view"><xsl:value-of select="rows/content/view_1/fields/detalhes_de_processo/label"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/tipo_processo"><div class="view-item text-{rows/content/view_1/fields/tipo_processo/@class} gen-fields-holder" item-name="tipo_processo"><xsl:if test="rows/content/view_1/fields/tipo_processo/@img != ''"><i class="fa {rows/content/view_1/fields/tipo_processo/@img} view-img"><xsl:if test="rows/content/view_1/fields/tipo_processo/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/tipo_processo/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/tipo_processo/@showlabel != 'false' or not(rows/content/view_1/fields/tipo_processo/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/tipo_processo/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/tipo_processo/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/numero_processo"><div class="view-item text-{rows/content/view_1/fields/numero_processo/@class} gen-fields-holder" item-name="numero_processo"><xsl:if test="rows/content/view_1/fields/numero_processo/@img != ''"><i class="fa {rows/content/view_1/fields/numero_processo/@img} view-img"><xsl:if test="rows/content/view_1/fields/numero_processo/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/numero_processo/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/numero_processo/@showlabel != 'false' or not(rows/content/view_1/fields/numero_processo/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/numero_processo/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/numero_processo/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/criado_por_"><div class="view-item text-{rows/content/view_1/fields/criado_por_/@class} gen-fields-holder" item-name="criado_por_"><xsl:if test="rows/content/view_1/fields/criado_por_/@img != ''"><i class="fa {rows/content/view_1/fields/criado_por_/@img} view-img"><xsl:if test="rows/content/view_1/fields/criado_por_/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/criado_por_/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/criado_por_/@showlabel != 'false' or not(rows/content/view_1/fields/criado_por_/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/criado_por_/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/criado_por_/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/data_inicio"><div class="view-item text-{rows/content/view_1/fields/data_inicio/@class} gen-fields-holder" item-name="data_inicio"><xsl:if test="rows/content/view_1/fields/data_inicio/@img != ''"><i class="fa {rows/content/view_1/fields/data_inicio/@img} view-img"><xsl:if test="rows/content/view_1/fields/data_inicio/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/data_inicio/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/data_inicio/@showlabel != 'false' or not(rows/content/view_1/fields/data_inicio/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/data_inicio/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/data_inicio/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/detalhes_de_tarefa"><div class="view-item view-separator gen-fields-holder" item-name="detalhes_de_tarefa"><span class="view"><xsl:value-of select="rows/content/view_1/fields/detalhes_de_tarefa/label"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/descricao_de_tarefa"><div class="view-item text-{rows/content/view_1/fields/descricao_de_tarefa/@class} gen-fields-holder" item-name="descricao_de_tarefa"><xsl:if test="rows/content/view_1/fields/descricao_de_tarefa/@img != ''"><i class="fa {rows/content/view_1/fields/descricao_de_tarefa/@img} view-img"><xsl:if test="rows/content/view_1/fields/descricao_de_tarefa/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/descricao_de_tarefa/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/descricao_de_tarefa/@showlabel != 'false' or not(rows/content/view_1/fields/descricao_de_tarefa/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/descricao_de_tarefa/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/descricao_de_tarefa/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/n_tarefa"><div class="view-item text-{rows/content/view_1/fields/n_tarefa/@class} gen-fields-holder" item-name="n_tarefa"><xsl:if test="rows/content/view_1/fields/n_tarefa/@img != ''"><i class="fa {rows/content/view_1/fields/n_tarefa/@img} view-img"><xsl:if test="rows/content/view_1/fields/n_tarefa/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/n_tarefa/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/n_tarefa/@showlabel != 'false' or not(rows/content/view_1/fields/n_tarefa/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/n_tarefa/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/n_tarefa/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/atribuido_a"><div class="view-item text-{rows/content/view_1/fields/atribuido_a/@class} gen-fields-holder" item-name="atribuido_a"><xsl:if test="rows/content/view_1/fields/atribuido_a/@img != ''"><i class="fa {rows/content/view_1/fields/atribuido_a/@img} view-img"><xsl:if test="rows/content/view_1/fields/atribuido_a/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/atribuido_a/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/atribuido_a/@showlabel != 'false' or not(rows/content/view_1/fields/atribuido_a/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/atribuido_a/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/atribuido_a/value"/></span></div></xsl:if></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/lookup/igrp.lookup.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/daterangepicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/IGRP.daterangepicker.config.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/locale/dp.locale.pt.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=6"/></xsl:stylesheet>

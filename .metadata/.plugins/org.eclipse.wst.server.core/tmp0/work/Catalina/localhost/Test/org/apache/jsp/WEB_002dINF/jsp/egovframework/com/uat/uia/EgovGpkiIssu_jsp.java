/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.75
 * Generated at: 2022-02-11 04:23:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.egovframework.com.uat.uia;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EgovGpkiIssu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.10.0.jar", Long.valueOf(1644222486139L));
    _jspx_dependants.put("jar:file:/C:/eGovFramework/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.25.RELEASE.jar", Long.valueOf(1644222453419L));
    _jspx_dependants.put("jar:file:/C:/eGovFramework/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Test/WEB-INF/lib/egovframework.rte.ptl.mvc-3.10.0.jar!/META-INF/taglib.tld", Long.valueOf(1623743644000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1644222464643L));
    _jspx_dependants.put("jar:file:/C:/eGovFramework/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Test/WEB-INF/lib/spring-webmvc-4.3.25.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1564700074000L));
    _jspx_dependants.put("jar:file:/C:/eGovFramework/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Test/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

 /**
  * @Class Name : EgovGpkiIssu.jsp
  * @Description : 인증서 안내화면
  * @Modification Information
  * @
  * @  수정일         수정자                   수정내용
  * @ -------    --------    ---------------------------
  * @ 2009.03.25    박지욱          최초 생성
  *
  *  @author 공통서비스 개발팀 박지욱
  *  @since 2009.03.25
  *  @version 1.0
  *  @see
  *
  */

      out.write("\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\">\n");
      out.write("<title>MOPAS GPKI 인증서 안내</title>\n");
      out.write("<style>\n");
      out.write(".guide_wrap {box-sizing:border-box; width:730px; padding:15px; }\n");
      out.write(".guide_wrap h1 {font-size:16px; }\n");
      out.write(".guide_wrap h2 {margin-top:25px; }\n");
      out.write(".guide_wrap p {margin-top:10px; line-height:18px; }\n");
      out.write(".guide_wrap table {margin-top:10px; }\n");
      out.write(".guide_wrap table td {padding:10px; border:1px solid #dff0c7; }\n");
      out.write(".guide_wrap table td.lb {color:#74aa7d; font-weight:bold; text-align:center; background:#f3f9ea; } \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"guide_wrap\">\n");
      out.write("\n");
      out.write("		<h1>인증서 안내 페이지</h1>\n");
      out.write("	\n");
      out.write("		<h2>행정전자서명 인증서란?</h2>\n");
      out.write("		\n");
      out.write("		<p>“행정전자서명 인증서”라 함은 행정전자서명이 진정한 것임을 확인ㆍ증명할 수 있도록 하기 위하여 행정기관, 보조기관, 보좌기관, 전자문서유통 및 행정정보 공공이용, 공공기반, 은행 또는 사용자에게   발급하는 전자적 정보를 말한다.<br /><br />전자거래시 인증서를 사용하면 신원확인, 문서의 위·변조, 거래사실의 부인 방지 등의 효과를 얻을 수   있습니다. 인증서에는 인증서 버전, 인증서 일련번호, 인증서의 유효기간, 발급기관명 및 전자서명 알고리즘 정보, 가입자 이름 및 신원확인정보 등이 포함되어 있다.</p>\n");
      out.write("	\n");
      out.write("		<h2>인증서 발급 대상</h2>\n");
      out.write("	\n");
      out.write("		<p>행정전자서명 인증서 발급대상은 다음의 2가지로 분류된다.<br />\n");
      out.write("		<strong>첫째</strong>는 인증관리체계상 인증업무수행 인증기관, 등록기관, 원격등록기관에 해당하는 행정기관이 대상이며<br />\n");
      out.write("		<strong>둘째</strong>는 정보화시스템에 적용하기 위한 행정기관, 보조기관, 보좌기관, 공무원 그리고 해당 공무원과 행정기관, 보조기관, 보좌기관에서 관리하는 정보통신 장비가 일반 인증서 발급 대상이다.<br />\n");
      out.write("		<strong>셋째</strong>는 전자문서 유통 및 행정정보 공동이용 공공기관, 은행법으로 지정된 기관과 사용자가 발급대상이다.\n");
      out.write("		</p>\n");
      out.write("		\n");
      out.write("		<h2>인증/등록기관 인증서</h2>\n");
      out.write("		<table>\n");
      out.write("			<colgroup>\n");
      out.write("				<col style=\"width:120px\">\n");
      out.write("				<col style=\"\">\n");
      out.write("			</colgroup>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">최상위 인증기관</td>\n");
      out.write("				<td>인증관리센터는 행정전자서명 인증업무 수행 등에 활용하도록 최상위인증기관에 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">인증기관용</td>\n");
      out.write("				<td>인증관리센터는 안전행전부 장관이 지정ㆍ고시하는 정부인증기관을 대상으로 인증업무 수행등에 활용하도록 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">등록기관용</td>\n");
      out.write("				<td>인증관리센터는 등록기관 등록업무 수행 등에 활용하도록 등록기관 지정 행정기관에 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("		</table>\n");
      out.write("		\n");
      out.write("		<h2>기관/개인 인증서</h2>\n");
      out.write("		<table>\n");
      out.write("			<colgroup>\n");
      out.write("				<col style=\"width:120px\">\n");
      out.write("				<col style=\"width:120px\">\n");
      out.write("				<col style=\"\">\n");
      out.write("			</colgroup>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\" rowspan=\"3\">기관</td>\n");
      out.write("				<td><strong>기관용</strong></td>\n");
      out.write("				<td>인증관리센터는 사무관리규정에 따라 관인을 가질수 있는 행정기관, 보조기관, 보좌기관등의 과단위까지의 1개의 기관용   인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td><strong>특수목적용</strong></td>\n");
      out.write("				<td>인증관리센터는 사무관리규정에 따라 행정기관의 업무를 관인과 같이 처리할 수 없도록 규정한   특수관인을 관리하는 경우에 특수목적용 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td><strong>서버용</strong></td>\n");
      out.write("				<td>인증관리센터는 행정기관에서 관리해야할 책임이 있는 정보통신 장비가 일정 규칙에 의해 정보통신 장비가 지속적으로   행정업무를 처리하고자 하는 경우에 서버 단위로 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">개인</td>\n");
      out.write("				<td colspan=\"2\">인증관리센터는 행정기관 소속 공무원이 사용자인증 및 전자결재, 보안메일 등의   행정업무 또는 전자상거래 등에서 활용하도록 하기 위해 부처별 개인단위로 인증서를 발급합니다.</td>\n");
      out.write("			</tr>\n");
      out.write("		</table>\n");
      out.write("		\n");
      out.write("		<h2>인증/등록기관</h2>\n");
      out.write("		<table>\n");
      out.write("			<colgroup>\n");
      out.write("				<col style=\"width:120px\">\n");
      out.write("				<col style=\"width:88px\">\n");
      out.write("				<col style=\"\">\n");
      out.write("				<col style=\"\">\n");
      out.write("			</colgroup>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">구분</td>\n");
      out.write("				<td class=\"lb\">ou명</td>\n");
      out.write("				<td class=\"lb\">cn명</td>\n");
      out.write("				<td class=\"lb\">DN명(예)</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">최상위 인증기관</td>\n");
      out.write("				<td>ou=GPK</td>\n");
      out.write("				<td>cn=Root CA</td>\n");
      out.write("				<td>cn=Root CA, ou=GPKI, o=Government of Korea,c=KR</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">인증기관</td>\n");
      out.write("				<td>ou=GPKI</td>\n");
      out.write("				<td>cn=CA + 기관코드(7) + 일련번호(2)</td>\n");
      out.write("				<td>cn=CA131000001, ou=GPKI, o=Government of Korea,c=KR</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">등록기관</td>\n");
      out.write("				<td>cn=해당인증기관,<br />\n");
      out.write("				ou=GPKI<br /></td>\n");
      out.write("				<td>cn=RA   + 기관코드(7) + 일련번호(2)</td>\n");
      out.write("				<td>cn=RA131000001,cn=CA131000001, ou=GPKI, o=Government of Korea,c=KR</td>\n");
      out.write("			</tr>\n");
      out.write("		</table>\n");
      out.write("		\n");
      out.write("		<h2>기관/개인</h2>\n");
      out.write("		<table>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\" colspan=\"2\">구분</td>\n");
      out.write("				<td class=\"lb\">ou명</td>\n");
      out.write("				<td class=\"lb\">cn명</td>\n");
      out.write("				<td class=\"lb\">DN명</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">기관 </td>\n");
      out.write("				<td>기관용</td>\n");
      out.write("				<td>ou=최하위기관명, ou=상위기관명, ou=최상위기관명</td>\n");
      out.write("				<td>-</td>\n");
      out.write("				<td>ou=보안관리팀, ou=전자정부본부, ou=안전행전부, o=Government of Korea, c=KR</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"lb\">서버용</td>\n");
      out.write("				<td>ou=Group of Server</td>\n");
      out.write("				<td>cn=SVR + 기관코드(7) + 일련번호(3)</td>\n");
      out.write("				<td>cn=SVR131000001, ou=Group of Server, o=Government of Korea, c=KR</td>\n");
      out.write("				<td></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr >\n");
      out.write("				<td class=\"lb\">개인 </td>\n");
      out.write("				<td>&nbsp;</td>\n");
      out.write("				<td>ou=people, ou=최상위기관명</td>\n");
      out.write("				<td>cn=기관구분자(3) + 이름 + 일련번호(3)<br />\n");
      out.write("				*일련번호:동명이인</td>\n");
      out.write("				<td>cn=001홍길동001, ou=people, ou=안전행전부, o=Government of Korea, c=KR</td>\n");
      out.write("			</tr>\n");
      out.write("		</table>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("<!-- 인증서소개 끝 -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/jsp/egovframework/com/uat/uia/EgovGpkiIssu.jsp(27,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/css/egovframework/com/com.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}

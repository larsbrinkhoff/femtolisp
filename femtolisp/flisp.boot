(zero? #function("7000r1~`W;" [] zero?) vector.map #function("8000r2c0e1\x7f31u42;" [#function("8000vc0e1~31u42;" [#function(":000v`\x80azc0qw2~;" [#function(":000r1\x80~i20i21~[31\\;" [])]) vector.alloc]) length] vector.map) vector->list #function("9000r1c0e1~31_u43;" [#function(":000va~c0qw2\x7f;" [#function("8000r1i10\x80~z[\x81Ko01;" [])]) length] vector->list) values #function("9000s0~F16602~NA650~M;\x80~K;" [] #5=[(*values*) ()]) untrace #function("8000r1c0e1~31u42;" [#function("9000ve0~316@0e1\x80e2~31b2[42;^;" [traced? set-top-level-value! function:vals]) top-level-value] untrace) traced? #function("8000r1e0~31e0\x8031>;" [function:code] [#function(":000s0e0c1~K312c2~x2;" [println x #.apply]) ()]) trace #function("8000r1c0e1~31u322c2;" [#function("8000vc0e130u42;" [#function("?000ve0\x80317a0e1i10e2c3~c4c5c6c7i10L2~L3L2c8c7\x80L2~L3L3L33142;^;" [traced? set-top-level-value! eval lambda begin println cons quote apply]) gensym]) top-level-value ok] trace) to-proper #function("9000r1~\x8740~;~?660~L1;~Me0~N31K;" [to-proper] to-proper) table.values #function("9000r1e0c1_~43;" [table.foldl #function("7000r3\x7fg2K;" [])] table.values) table.pairs #function("9000r1e0c1_~43;" [table.foldl #function("7000r3~\x7fKg2K;" [])] table.pairs) table.keys #function("9000r1e0c1_~43;" [table.foldl #function("7000r3~g2K;" [])] table.keys) table.invert #function("8000r1c0e130u42;" [#function("9000ve0c1q_\x80332~;" [table.foldl #function("9000r3e0\x80\x7f~43;" [put!])]) table] table.invert) table.foreach #function("9000r2e0c1q_\x7f43;" [table.foldl #function("8000r3\x80~\x7f322];" [])] table.foreach) table.clone #function("8000r1c0e130u42;" [#function("9000ve0c1q_\x80332~;" [table.foldl #function("9000r3e0\x80~\x7f43;" [put!])]) table] table.clone) symbol-syntax #function("9000r1e0e1~^43;" [get *syntax-environment*] symbol-syntax) string.trim #function("9000r3c0^^u43;" [#function("8000vc0qm02c1qm12c2e3\x8031u42;" [#function(";000r4g2g3X16?02e0\x7fe1~g232326A0\x80~\x7fe2~g232g344;g2;" [string.find string.char string.inc] trim-start) #function("<000r3e0g2`3216D02e1\x7fe2~e3~g23232326?0\x81~\x7fe3~g23243;g2;" [> string.find string.char string.dec] trim-end) #function("<000ve0i10\x80i10i11`~34\x81i10i12~3343;" [string.sub]) length])] string.trim) string.tail #function(";000r2e0~e1~`\x7f3342;" [string.sub string.inc] string.tail) string.rpad #function("<000r3e0~e1g2\x7fe2~31z3242;" [string string.rep string.count] string.rpad) string.rep #function(";000r2\x7fb4X6`0e0\x7f`32650c1;\x7faW680e2~41;\x7fb2W690e2~~42;e2~~~43;e3\x7f316@0e2~e4~\x7faz3242;e4e2~~32\x7fb2U242;" [<= "" string odd? string.rep] string.rep) string.map #function("9000r2c0e130e2\x7f31u43;" [#function("8000vc0`u322e1~41;" [#function(";000v^~\x81X6S02e0\x80i10e1i11~3231322e2i11~32m05\x0b/;" [io.putc string.char string.inc]) io.tostring!]) buffer length] string.map) string.lpad #function(";000r3e0e1g2\x7fe2~31z32~42;" [string string.rep string.count] string.lpad) string.join #function("8000r2~\x8750c0;c1e230u42;" ["" #function("8000ve0~\x80M322e1c2q\x80N322e3~41;" [io.write for-each #function("8000r1e0\x80i11322e0\x80~42;" [io.write]) io.tostring!]) buffer] string.join) simple-sort #function("8000r1~A17602~NA640~;c0~Mu42;" [#function("9000vc0e1c2q\x80N32u42;" [#function(":000ve0e1~M31\x80L1e1~N3143;" [nconc simple-sort]) separate #function("7000r1~\x80X;" [])])] simple-sort) set-syntax! #function("9000r2e0e1~\x7f43;" [put! *syntax-environment*] set-syntax!) separate #function(":000r2\x80~\x7f__44;" [] #0=[#function("6000r4\x7f\x8780g2g3K;~\x7fM316@0\x80~\x7fN\x7fMg2Kg344;\x80~\x7fNg2\x7fMg3K44;" [] #0#) ()]) self-evaluating? #function("8000r1~?16602~C@17K02e0~3116A02~C16:02~e1~31<;" [constant? top-level-value] self-evaluating?) reverse! #function("8000r1c0_u42;" [#function("9000v^\x80F6C02\x80N\x80~\x80m02P2o005\x1c/2~;" [])] reverse!) reverse #function("9000r1e0c1_~43;" [foldl #.cons] reverse) revappend #function("8000r2e0e1~31\x7f42;" [nconc reverse] revappend) repl #function("9000r0c0^^u43;" [#function("6000vc0m02c1qm12\x7f302e240;" [#function("8000r0e0c1312e2e3312c4c5c6tu42;" [princ "> " io.flush *output-stream* #function("8000ve0e131@16=02c2e3~31u42;" [io.eof? *input-stream* #function("7000ve0~312~k12];" [print that]) load-process]) #function("6000r0e040;" [read]) #function("7000r1e0e1312e2~41;" [io.discardbuffer *input-stream* raise])] prompt) #function("7000r0c0qc1t6;0e2302\x8140;^;" [#function("7000r0\x803016702e040;" [newline]) #function("7000r1e0~312e1e230312];" [print-exception print-stack-trace stacktrace]) newline] reploop) newline])] repl) remainder #1=#function("8000r2~~\x7fV\x7fT2z;" [] mod0) ref-int32-LE #function("=000r2e0e1~\x7f`y[`32e1~\x7fay[b832e1~\x7fb2y[b@32e1~\x7fb3y[bH32R441;" [int32 ash] ref-int32-LE) ref-int16-LE #function(";000r2e0e1~\x7f`y[`32e1~\x7fay[b832y41;" [int16 ash] ref-int16-LE) read-all-of #function("9000r2c0^u32_~\x7f3142;" [#function("6000vc0qm0;" [#function("9000r2e0i1131680e1~41;\x80\x7f~Ki10i113142;" [io.eof? reverse!])])] read-all-of) read-all #function("8000r1e0e1~42;" [read-all-of read] read-all) random #function("8000r1e0~316<0e1e230~42;e330~T2;" [integer? mod rand rand.double] random) quotient #.div0 quote-value #function("7000r1e0~31640~;c1~L2;" [self-evaluating? quote] quote-value) println #function("9000s0e0~Q2e1302;" [print newline] println) printable? #function("7000r1e0~31@;" [iostream?] printable?) print-to-string #function("8000r1c0e130u42;" [#function("8000ve0~\x80322e1~41;" [io.print io.tostring!]) buffer] print-to-string) print-stack-trace #function("9000r1c0^^u43;" [#function("<000vc0qm02c1qm12c2e3e4\x80b53231e5e6e7c8e9303232`u44;" [#function("8000r3c0e1~31g2Ku42;" [#function(":000ve0\x8031e0\x8131\x84>0e1c2c3~L341;c4e5\x8031u42;" [function:code raise thrown-value ffound #function(":000v`e0e1~3131c2qw;" [1- length #function("9000r1e0\x80~[316A0i30\x80~[i21i1043;^;" [closure?])]) function:vals]) function:name] find-in-f) #function("8000r2c0c1qc2tu42;" [#function(";000v~6H0e0e1e2e3e4~3132c53241;c6;" [symbol string.join map string reverse! "/" lambda]) #function("8000r0e0c1q\x81322^;" [for-each #function("9000r1i10~\x80_43;" [])]) #function("7000r1~F16B02~Mc0<16802~\x86c1<680e2~41;e3~41;" [thrown-value ffound caddr raise])] fn-name) #function("8000ve0c1q~42;" [for-each #function("9000r1e0c1i02c2332e3i11~`[\x8132e4~31NK312e5302i02ayo02;" [princ "#" " " print vector->list newline])]) reverse! list-tail filter closure? map #function("7000r1~E16802e0~41;" [top-level-value]) environment])] print-stack-trace) print-exception #function("9000r1c0^^u43;" [#function("<000vc0m02c1m12\x80F16D02\x80Mc2<16:02e3\x80b4326N0~c4\x80\x86c5e6\x8031c7352\x7fe8\x8031315\xc90\x80F16@02\x80Mc9<16602\x80NF6>0~c:\x80\x86c;335\xa60\x80F16802\x80Mc<<6@0~c=312~\x80NQ25\x890\x80F16802\x80Mc><6F0e?e6\x8031312~c@\x80\x86325f0eA\x803116:02e3\x80b2326H0\x7f\x80M312~cB312cC\x80\x86u325<0~cD312\x7f\x80312~eE41;" [#function(":000s0e0e1~x3;" [io.princ *error-stream*] eprinc) #function(":000s0e0e1~x3;" [io.print *error-stream*] eprint) type-error length= "type-error: " ": expected " caddr ", got " cadddr unbound-error "unbound-error: eval: variable " " has no value" error "error: " load-error print-exception "in file " list? ": " #function("8000ve0~3117502~C660\x80530\x81~41;" [string?]) "*** Unhandled exception: " *linefeed*])] print-exception) print #function(":000s0e0e1~x3;" [io.print *output-stream*] print) princ #function(":000s0e0e1~x3;" [io.princ *output-stream*] princ) positive? #function("8000r1e0~`42;" [>] positive?) odd? #function("7000r1e0~31@;" [even?] odd?) nreconc #function("8000r2e0e1~31\x7f42;" [nconc reverse!] nreconc) nnn #function("8000r1e0c1~42;" [count #function("6000r1~A@;" [])] nnn) newline #function("7000r0e0e1312];" [princ *linefeed*] newline) nestlist #function(";000r3e0g2`32640_;\x7fe1~~\x7f31g2az33K;" [<= nestlist] nestlist) negative? #function("7000r1~`X;" [] negative?) mod0 #1# mod #function("9000r2~e0~\x7f32\x7fT2z;" [div] mod) min #function("=000s1\x7f\x8740~;e0c1~\x7f43;" [foldl #function("7000r2~\x7fX640~;\x7f;" [])] min) memv #function("8000r2\x7f?640^;\x7fM~=640\x7f;e0~\x7fN42;" [memv] memv) member #function("8000r2\x7f?640^;\x7fM~>640\x7f;e0~\x7fN42;" [member] member) max #function("=000s1\x7f\x8740~;e0c1~\x7f43;" [foldl #function("7000r2~\x7fX640\x7f;~;" [])] max) mark-label #function("9000r2e0~c1\x7f43;" [emit :label] mark-label) map-int #function("9000r2e0\x7f`32640_;c1~`31_K_u43;" [<= #function(":000v~m12a\x81azc0qw2~;" [#function("8000r1\x81i10~31_KP2\x81No01;" [])])] map-int) map! #function("9000r2\x7f^\x7fF6B02\x7f~\x7fM31O2\x7fNm15\x1d/2;" [] map!) map #function("=000s2c0^^u43;" [#function("9000vc0m02c1qm12i02\x87;0~\x80\x81_L143;\x7f\x80\x81i02K42;" [#function("9000r3g2^\x7fF6H02g2~\x7fM31_KPNm22\x7fNm15\x17/2N;" [] map1) #function("=000r2\x7fM\x8740_;~\x80c0\x7f_L133Q2\x81~\x80c1\x7f_L13332K;" [#.car #.cdr] mapn)])] map) make-system-image #function(";000r1c0e1~c2c3c434c5e6u44;" [#function("8000v^k02c1c2qu42;" [*print-pretty* #function("7000vc0qc1qt~302;" [#function(":000r0c0e1c2qe3e4303132u42;" [#function(">000ve0i10e1e2c3~e2e4~3233Q2322e5i10e642;" [io.print nconc map #.list top-level-value io.write *linefeed*]) filter #function("9000r1~E16w02e0~31@16l02e1~31G@17C02e2~31e2e1~3131>@16K02e3~i1132@16=02e4e1~3131@;" [constant? top-level-value string memq iostream?]) simple-sort environment]) #function("7000r1\x80302e0~41;" [raise])]) #function("7000r0e0\x80312i02k1;" [io.close *print-pretty*])]) file :write :create :truncate (*linefeed* *directory-separator* *argv* that *print-pretty* *print-width* *print-readably*) *print-pretty*] make-system-image) make-label #function("6000r1e040;" [gensym] make-label) make-code-emitter #function("9000r0_e030`c1Z4;" [table +Inf] make-code-emitter) macroexpand-1 #function("8000r1~?640~;c0e1~31u42;" [#function("7000v~680~\x80Nx2;\x80;" []) macrocall?] macroexpand-1) macroexpand #function("8000r1c0^u42;" [#function("8000vc0qm02~\x80_42;" [#function("9000r2~?640~;c0e1~M\x7f32u42;" [#function("9000v~6C0i10~\x86\x80NQ2e0~3142;c1e2\x8031u42;" [caddr #function("C000v~6B0i20~i10NQ2i1142;i10Mc0\x8460i10;i10Mc1\x84V0e2c1L1i10\x86L1e3c4qe5i103132e6i103144;i10Mc7\x84O0e2c7L1i10\x86L1e3c8qe5i10313243;i10Mc9\x84T0c:i10\x86e2c1L1_L1e;e5i10313133L1u43;e3c<qi1042;" [quote lambda nconc map #function("8000r1i30~i2142;" []) cddr lastcdr define #function("8000r1i30~i2142;" []) let-syntax #function(";000vi30\x7fe0e1c2q~32i213242;" [nconc map #function("9000r1~Mi40~\x86i3132i31L3;" [])]) copy-list #function("8000r1i30~i2142;" [])]) macrocall?]) assq] macroexpand-in)])] macroexpand) macrocall? #function("9000r1~MC16<02e0e1~M^43;" [get *syntax-environment*] macrocall?) lookup-sym #function("8000r4\x7f\x8750c0;c1\x7fMu42;" [(global) #function(":000vc0e1\x80~`33u42;" [#function(";000v~6G0i13680c0~L2;c1i12~L3;e2i10i11Ni1317502\x80A680i12570i12ay^44;" [arg closed lookup-sym]) index-of])] lookup-sym) load-process #function("7000r1e0~41;" [eval] load-process) load #function("9000r1c0e1~c232u42;" [#function("7000vc0qc1qt;" [#function("9000r0c0^u32^^^43;" [#function("6000vc0qm0;" [#function(":000r3e0i10317C0\x80e1i1031~e2\x7f3143;e3i10312e2\x7f41;" [io.eof? read load-process io.close])])]) #function("9000r1e0\x80312e1c2i10~L341;" [io.close raise load-error])]) file :read] load) list? #function("7000r1~A17@02~F16902e0~N41;" [list?] list?) list-tail #function("9000r2e0\x7f`32640~;e1~N\x7faz42;" [<= list-tail] list-tail) list-ref #function("8000r2e0~\x7f32M;" [list-tail] list-ref) list-head #function(":000r2e0\x7f`32640_;~Me1~N\x7faz32K;" [<= list-head] list-head) list->vector #function("7000r1c0~x2;" [#.vector] list->vector) length> #function("9000r2\x7f`X640~;\x7f`W6;0~F16402~;~?660\x7f`X;e0~N\x7faz42;" [length>] length>) length= #function("9000r2\x7f`X640^;\x7f`W650~?;~?660\x7f`W;e0~N\x7faz42;" [length=] length=) lastcdr #function("7000r1~?640~;e0~31N;" [last-pair] lastcdr) last-pair #function("7000r1~N?640~;e0~N41;" [last-pair] last-pair) iota #function("8000r1e0e1~42;" [map-int identity] iota) io.readlines #function("8000r1e0e1~42;" [read-all-of io.readline] io.readlines) io.readline #function("8000r1e0~c142;" [io.readuntil #\x000a] io.readline) index-of #function(";000r3\x7f\x8740^;~\x7fM\x8450g2;e0~\x7fNg2ay43;" [index-of] index-of) in-env? #function("8000r2e0c1q\x7f42;" [any #function("8000r1e0\x80~42;" [memq])] in-env?) identity #function("6000r1~;" [] identity) hex5 #function("9000r1e0e1~b@32b5c243;" [string.lpad number->string #\0] hex5) get-defined-vars #function("8000r1e0\x80~3141;" [delete-duplicates] #2=[#function(":000r1~?640_;~Mc0<16602~NF6d0~\x86C16702~\x86L117S02~\x86F16E02e1~31C16:02e1~31L117402_;~Mc2\x84>0e3e4\x80~N32x2;_;" [define caadr begin append map] #2#) ()]) for-each #function("8000r2\x7fF6@0~\x7fM312e0~\x7fN42;];" [for-each] for-each) foldr #function("<000r3g2\x8740\x7f;~g2Me0~\x7fg2N3342;" [foldr] foldr) foldl #function(";000r3g2\x8740\x7f;e0~~g2M\x7f32g2N43;" [foldl] foldl) fits-i8 #function("8000r1~I16F02e0~b\xb03216:02e1~b\xaf42;" [>= <=] fits-i8) filter #function("9000r2\x80~\x7f_43;" [] #3=[#function("9000r3\x7f\x8750g2;~\x7fM316>0\x80~\x7fN\x7fMg2K43;\x80~\x7fNg243;" [] #3#) ()]) expand-define #function("<000r2~C6:0c0~\x7fML3;c0~Me1c2L1~NL1e3\x7f31~M34L3;" [set! nconc lambda copy-list] expand-define) expand #function("7000r1e0~41;" [macroexpand] expand) every #function("8000r2\x7f?17D02~\x7fM3116:02e0~\x7fN42;" [every] every) even? #function("8000r1e0~a32`W;" [logand] even?) eval #function("8000r1e0e1~313140;" [compile-thunk expand] eval) error #function(":000s0e0c1~K41;" [raise error] error) encode-byte-code #function("8000r1c0e1~31u42;" [#function("8000vc0e1~31u42;" [#function(";000vc0e1e2~31b3e2~31b2VT2yc332u42;" [#function(">000vc0e1\x8031`e230e230e330^^u48;" [#function("?000ve0g4c1322^\x7f~X6\xe302i10\x7f[m52g5c2\x84O0e3g2i10\x7fay[e4g431332\x7fb2ym15\xb30e0g4e5e6e7\x806<0c8g5u32540g53231322\x7faym12\x7f~X6:0i10\x7f[530^m62e9g5c:326^0e3g3e4g431g6332e0g4\x80670e;540e<`31322\x7faym15C0g6D6<0c=g5u32530^5{/2e>c?qg3322e@g441;" [io.write #int32(0) :label put! sizeof byte get Instructions #function("9000v~c0\x8450c1;~c2\x8450c3;~c4\x8450c5;~c6\x8450c7;~c8\x8450c9;~c:\x8450c;;i05;" [:jmp :jmp.l :brt :brt.l :brf :brf.l :brne :brne.l :brnn :brnn.l :brn :brn.l]) memq (:jmp :brf :brt :brne :brnn :brn) int32 int16 #function(":000ve0~c1326H0e2i04e3i0631322\x81ayo01;e0~c4326`0e2i04e5i0631322\x81ayo012e2i04e5i20\x81[31322\x81ayo01;e0~c6326`0e2i04e3i0631322\x81ayo012e2i04e3i20\x81[31322\x81ayo01;e2i04e5i0631322\x81ayo01;" [memq (:loadv.l :loadg.l :setg.l :loada.l :seta.l :largc :lvargc :call.l :tcall.l) io.write int32 (:loadc :setc) uint8 (:loadc.l :setc.l)]) table.foreach #function("<000r2e0i04~322e1i04i10670e2540e3e4i02\x7f32~z3142;" [io.seek io.write int32 int16 get]) io.tostring!]) length table buffer]) >= length 65536]) list->vector]) reverse!] encode-byte-code) emit #function("I000s2g2\x87b0\x7fc0<16C02~`[F16:02~`[Mc1<6;0~`[c2O5:0~`\x7f~`[K\\5\xe20e3\x7fc4326A0e5~g2M32L1m2530^2c6e7\x7fc832u322c9e7\x7fc:32u322\x7fc;\x84\\0g2c<>6=0c=m12_m25F0g2c>>6=0c?m12_m2530^530^2\x7fc@\x84\\0g2cA>6=0cBm12_m25F0g2cC>6=0cDm12_m2530^530^2cE~`[F690~`[M530_~`[u332~;" [:car :cdr :cadr memq (:loadv :loadg :setg) bcode:indexfor #function("8000v~16=02e0i02Mc132680~\x86o01;^;" [> 255]) assq ((:loadv :loadv.l) (:loadg :loadg.l) (:setg :setg.l) (:loada :loada.l) (:seta :seta.l)) #function("8000v~16L02e0i02Mc13217=02e0i02\x86c132680~\x86o01;^;" [> 255]) ((:loadc :loadc.l) (:setc :setc.l)) :loada (0) :loada0 (1) :loada1 :loadc (0 0) :loadc00 (0 1) :loadc01 #function(";000v\x81c0<16A02~c1<16802\x7f\x86c2<6C0\x80`i02Mc3e4\x7f31KK\\;\x81c0<16702~c1<6@0\x80`i02Mc5\x7fNKK\\;\x81c0<16702~c6<6@0\x80`i02Mc7\x7fNKK\\;\x81c0<16702~c2<6@0\x80`i02Mc8\x7fNKK\\;\x81c5<16702~c2<6@0\x80`i02Mc3\x7fNKK\\;\x80`e9\x81i02K\x7f32\\;" [:brf :not :null? :brn cddr :brt :eq? :brne :brnn nreconc])] emit) div #function("8000r2~\x7fV~`X16C02\x7f`X16402a17502b/17402`y;" [] div) display #function("7000r1e0~312];" [princ] display) disassemble #function(">000s1\x7f\x87C0e0~`322e1302];530^2c2\x7fMe3~31e4~31u44;" [disassemble newline #function("8000vc0^u42;" [#function(":000vc0qm02`\x80azc1w2e2c3e4\x81`32c5332c6b4e7\x8131u43;" [#function("9000r1~J16602~G@6D0e0c1312e2~i10ay42;e3~41;" [princ "\n" disassemble print] print-val) #function("7000r1e0c141;" [princ "\t"]) princ "maxstack " ref-int32-LE "\n" #function(":000v^~\x7fX6E02c0e1c2q^e333u325\x19/;" [#function("<000ve0\x80b432690e130530^2`i20azc2w2e3e4\x80b4z31c5e6e7~31a32c8342\x80ayo002c9~u42;" [> newline #function("7000r1e0c141;" [princ "\t"]) princ hex5 ":  " string.tail string "\t" #function("=000ve0~c1326P0i20i32e2i31i1032[312i10b4yo10;e0~c3326L0i20i32i31i10[[312i10ayo10;e0~c4326K0e5e6i31i10[31312i10ayo10;e0~c7326O0e5e6e2i31i103231312i10b4yo10;e0~c8326f0e5e6i31i10[31c9322i10ayo102e5e6i31i10[31312i10ayo10;e0~c:326n0e5e6e2i31i103231c9322i10b4yo102e5e6e2i31i103231312i10b4yo10;e0~c;326X0e5c<e=i10b,e>i31i1032R331322i10b2yo10;e0~c?326X0e5c<e=i10b,e2i31i1032R331322i10b4yo10;^;" [memq (:loadv.l :loadg.l :setg.l) ref-int32-LE (:loadv :loadg :setg) (:loada :seta :call :tcall :list :+ :- :* :/ :vector :argc :vargc :loadi8 :apply :tapply) princ number->string (:loada.l :seta.l :largc :lvargc :call.l :tcall.l) (:loadc :setc) " " (:loadc.l :setc.l) (:jmp :brf :brt :brne :brnn :brn) "@" hex5 ref-int16-LE (:jmp.l :brf.l :brt.l :brne.l :brnn.l :brn.l)])]) table.foldl #function("8000r3g217@02\x7fi21\x80[<16402~;" []) Instructions]) length])]) function:code function:vals] disassemble) delete-duplicates #function("9000r1~?640~;c0~M~Nu43;" [#function("8000ve0~\x7f32680e1\x7f41;~e1\x7f31K;" [member delete-duplicates])] delete-duplicates) count #function("8000r2c0^u42;" [#function("9000vc0qm02~\x80\x81`43;" [#function("9000r3\x7f\x8750g2;\x80~\x7fN~\x7fM31690g2ay540g243;" [] count-)])] count) copy-tree #function("8000r1~?640~;e0~M31e0~N31K;" [copy-tree] copy-tree) const-to-idx-vec #function("9000r1c0e1e2~3131u42;" [#function("9000ve0c1qe2\x8031322~;" [table.foreach #function("8000r2\x80\x7f~\\;" []) bcode:ctable]) vector.alloc bcode:nconst] const-to-idx-vec) compile-while #function("9000r4c0e1~31e1~31u43;" [#function(":000ve0\x80\x81^^342e1\x80~322e0\x80\x81^i02342e2\x80c3\x7f332e2\x80c4322e0\x80\x81^i03342e2\x80c5~332e1\x80\x7f42;" [compile-in mark-label emit :brf :pop :jmp]) make-label] compile-while) compile-thunk #function(";000r1e0e1c2L1_L1~L1\x803441;" [compile nconc lambda] #4=[#:g578 ()]) compile-sym #function(";000r4c0e1g2\x7f`]34u42;" [#function("8000vc0~Mu42;" [#function(">000v~c0\x84A0e1i10i13`[\x80\x8643;~c2\x84[0e1i10i13a[\x80\x86e3\x8031342e4i10e5i11N31a\x80\x86S342;e6i123116>02e7e8i1231316C0e1i10c9e8i123143;e1i10i13b2[i1243;" [arg emit closed caddr bcode:cdepth nnn constant? printable? top-level-value :loadv])]) lookup-sym] compile-sym) compile-short-circuit #function(":000r6g3?6=0e0~\x7fg2g444;g3N?6>0e0~\x7fg2g3M44;c1e2~31u42;" [compile-in #function("<000ve0\x80\x81^i03M342e1\x80c2322e1\x80i05~332e1\x80c3322e4\x80\x81i02i03Ni04i05362e5\x80~42;" [compile-in emit :dup :pop compile-short-circuit mark-label]) make-label] compile-short-circuit) compile-prog1 #function(";000r3e0~\x7f^g2\x86342e1g231F6H0e2~\x7f^e1g231342e3~c442;^;" [compile-in cddr compile-begin emit :pop] compile-prog1) compile-or #function("<000r4e0~\x7fg2g3^c146;" [compile-short-circuit :brt] compile-or) compile-let #function("9000r4c0g3Mg3Nu43;" [#function(";000ve0\x7fe1~\x863132660^5=0e2e3c4~32312e5c6qc7q322c8e9\x80\x81\x7f33u42;" [length= length error string "apply: incorrect number of arguments to " call-with-values #function("9000r0e0i11\x80]43;" [compile-f-]) #function("9000r2e0i10c1~332e2i10\x7f42;" [emit :loadv bcode:cdepth]) #function(";000ve0i10c1322e0i10i12670c2540c3a~y43;" [emit :copyenv :tcall :call]) compile-arglist])] compile-let) compile-in #function(":000r4g3C6=0e0~\x7fg3c144;g3?6\x950g3`\x84:0e2~c342;g3a\x84:0e2~c442;g3]\x84:0e2~c542;g3^\x84:0e2~c642;g3_\x84:0e2~c742;e8g3316<0e2~c9g343;e2~c:g343;c;g3Mu42;" [compile-sym [:loada :loadc :loadg] emit :load0 :load1 :loadt :loadf :loadnil fits-i8 :loadi8 :loadv #function("S000v~c0\x84>0e1\x80c2i03\x8643;~c3\x84?0e4\x80\x81i02i0344;~c5\x84@0e6\x80\x81i02i03N44;~c7\x84<0e8\x80\x81i0343;~c9\x84=0e:c;qc<q42;~c=\x84@0e>\x80\x81i02i03N44;~c?\x84@0e@\x80\x81i02i03N44;~cA\x84G0eB\x80\x81i03\x86c5eCi0331K44;~cD\x84K0eE\x80\x81i03\x86eFi0331eGi033145;~cH\x84F0eI\x80\x81]i03\x86342e1\x80cJ42;~cK\x84N0eI\x80\x81^eFi0331342eL\x80\x81i03\x86cM44;~cN\x84K0eI\x80\x81i02eOi03\x86eCi03313244;~cP\x84s0eI\x80\x81^c9_i03\x86L3342eQeFi033131660^580eRcS312eI\x80\x81^eFi0331342e1\x80cT42;eU\x80\x81i02i0344;" [quote emit :loadv if compile-if begin compile-begin prog1 compile-prog1 lambda call-with-values #function("8000r0e0i11i1342;" [compile-f-]) #function("9000r2e0i10c1~332e2i10\x7f322\x7fe3i1131X6<0e0i10c442;^;" [emit :loadv bcode:cdepth nnn :closure]) and compile-and or compile-or while compile-while cddr for compile-for caddr cadddr return compile-in :ret set! compile-sym [:seta :setc :setg] define expand-define trycatch 1arg-lambda? error "trycatch: second form must be a 1-argument lambda" :trycatch compile-app])] compile-in) compile-if #function("=000r4c0e1~31e1~31g3\x86e2g331e3g331F6;0e4g331530^u46;" [#function("=000vg2]\x84>0e0\x80\x81i02g344;g2^\x84>0e0\x80\x81i02g444;e0\x80\x81^g2342e1\x80c2~332e0\x80\x81i02g3342i026<0e1\x80c3325:0e1\x80c4\x7f332e5\x80~322e0\x80\x81i02g4342e5\x80\x7f42;" [compile-in emit :brf :ret :jmp mark-label]) make-label caddr cdddr cadddr] compile-if) compile-for #function(":000r5e0g4316X0e1~\x7f^g2342e1~\x7f^g3342e1~\x7f^g4342e2~c342;e4c541;" [1arg-lambda? compile-in emit :for error "for: third form must be a 1-argument lambda"] compile-for) compile-f- #function("<000s2c0^u42;" [#function(":000vc0qm02c1e230\x81\x86e3\x8131i10\x8470c4570e3\x8131u44;" [#function(":000r1c0e1~31F6N0e2~31F6=0c3e1~31K570e4~31530^u42;" [#function("8000vc0e1~31u42;" [#function(";000v~\x8740\x80;e0c1~\x80i4034e2c3~32K;" [list* lambda map #function("6000r1^;" [])]) get-defined-vars]) cddr cdddr begin caddr] lambda-body) #function("B000vi12\x89<0e0~c1325\x840e2\x7fc3326N0e0~e4\x7f31\x8770c5540c6e7\x7f31335^0e4\x7f31\x87A0e0~c8e7\x7f31335G0e0~c9\x7f?660`570e7\x7f31332e:~e;\x7f31i10K]e4i1131i20\x84<0e<i1131580\x80i1131342e0~c=322e>e?e@eA~3131eB~31g233~b3[42;" [emit :let length> 255 lastcdr :largc :lvargc length :argc :vargc compile-in to-proper caddr :ret values function encode-byte-code bcode:code const-to-idx-vec]) make-code-emitter lastcdr lambda])] #4#) compile-f #function("<000s2e0c1qc242;" [call-with-values #function("9000r0e0\x80\x81i02x4;" [compile-f-]) #function("6000r2~;" [])] compile-f) compile-call #function("8000r4c0g3Mu42;" [#function("9000vc0~C16V02e1~\x8132@16J02~E16C02e2~3116902e3~31G6:0e3~31530~u42;" [#function(":000ve0i13Nc1326S0e2i10i11^~342c3e4i10i11i13N33u42;c5~G16802e6~31u42;" [length> 255 compile-in #function(":000ve0i20i22670c1540c2~43;" [emit :tcall.l :call.l]) compile-arglist #function(";000v\x80c0<16X02e1\x80i2132@16J02e2c031e0>16<02e3i23b2326L0e4i20i21^i23\x86342e5i20c642;~7A0e4i20i21^\x8034530^2c7e8i20i21i23N33u42;" [cadr in-env? top-level-value length= compile-in emit :cadr #function("=000v\x806H0e0i30i31i32i33i10\x80~47;e1i30i32670c2540c3~43;" [compile-builtin-call emit :tcall :call]) compile-arglist]) builtin->instruction]) in-env? constant? top-level-value])] compile-call) compile-builtin-call #function(":000r7c0e1e2g5^33u42;" [#function("9000v~16=02e0i03N~32@6=0e1i04~32530^2c2i05u42;" [length= argc-error #function("N000v~c0\x84R0i16`W6<0e1i10c242;e1i10i15i1643;~c3\x84e0i16`W6<0e1i10c442;i16b2W6<0e1i10c542;e1i10i15i1643;~c6\x84v0i16`W6;0e7i14a42;i16aW6<0e1i10c842;i16b2W6<0e1i10c942;e1i10i15i1643;~c:\x84R0i16`W6<0e1i10c;42;e1i10i15i1643;~c<\x84Q0i16`W6;0e7i14a42;e1i10i15i1643;~c=\x84T0i16`W6>0e1i10c>c?43;e1i10i15i1643;~c@\x84]0i16b2X6<0e7i14b242;e1i10i12670cA540c@i1643;e1i10i1542;" [:list emit :loadnil :+ :load0 :add2 :- argc-error :neg :sub2 :* :load1 :/ :vector :loadv [] :apply :tapply])]) get arg-counts] compile-builtin-call) compile-begin #function(":000r4g3?6<0e0~\x7fg2^44;g3N?6>0e0~\x7fg2g3M44;e0~\x7f^g3M342e1~c2322e3~\x7fg2g3N44;" [compile-in emit :pop compile-begin] compile-begin) compile-arglist #function("8000r3e0c1qg2322e2g241;" [for-each #function(":000r1e0\x80\x81^~44;" [compile-in]) length] compile-arglist) compile-app #function("8000r4c0g3Mu42;" [#function(":000v~F16Q02~Mc0<16G02e1~\x863116<02e2~\x86c332@6?0e4\x80\x81i02i0344;e5\x80\x81i02i0344;" [lambda list? length> 255 compile-let compile-call])] compile-app) compile-and #function("<000r4e0~\x7fg2g3]c146;" [compile-short-circuit :brf] compile-and) compile #function("8000r1e0_~42;" [compile-f] compile) closure? #function("7000r1~J16602~G@;" [] closure?) char? #function("7000r1e0~31c1<;" [typeof wchar] char?) cddr #function("6000r1~NN;" [] cddr) cdddr #function("6000r1~NNN;" [] cdddr) cddar #function("6000r1~MNN;" [] cddar) cdar #function("6000r1~MN;" [] cdar) cdadr #function("6000r1~\x86N;" [] cdadr) cdaar #function("6000r1~MMN;" [] cdaar) call-with-values #function("8000r2c0~30u42;" [#function("7000v~F16902i10~M<680\x81~Nx2;\x81~41;" [])] #5#) cadr #function("6000r1~\x86;" [] cadr) caddr #function("6000r1~N\x86;" [] caddr) cadddr #function("6000r1~NN\x86;" [] cadddr) cadar #function("6000r1~M\x86;" [] cadar) caar #function("6000r1~MM;" [] caar) caadr #function("6000r1~\x86M;" [] caadr) caaar #function("6000r1~MMM;" [] caaar) builtin->instruction #function("9000r1e0\x80~^43;" [get] [#table(#.number? :number?  #.cons :cons  #.fixnum? :fixnum?  #.equal? :equal?  #.eq? :eq?  #.symbol? :symbol?  #.div0 :div0  #.builtin? :builtin?  #.aset! :aset!  #.- :-  #.boolean? :boolean?  #.not :not  #.apply :apply  #.atom? :atom?  #.set-cdr! :set-cdr!  #./ :/  #.function? :function?  #.vector :vector  #.list :list  #.bound? :bound?  #.< :<  #.* :*  #.cdr :cdr  #.null? :null?  #.+ :+  #.eqv? :eqv?  #.compare :compare  #.aref :aref  #.set-car! :set-car!  #.car :car  #.pair? :pair?  #.= :=  #.vector? :vector?) ()]) bq-process #function("9000r1c0^^u43;" [#function("<000vc0m02c1m12e2\x80316H0\x80H6A0c3e4e5\x803131u42;\x80;\x80?680c6\x80L2;\x80Mc7\x84=0e4e4\x80\x863141;\x80Mc8\x8450\x80\x86;e9~\x80327C0c:e;\x8031e<\x7f\x8032u43;c=\x80_u43;" [#function("7000r1~F16B02~Mc0<17802~Mc1<17702~c2<;" [*comma-at* *comma-dot* *comma*] splice-form?) #function("7000r1~F16802~Mc0<650~\x86;e1~41;" [*comma* bq-process] bq-bracket1) self-evaluating? #function("8000v~Mc0\x8480c1~NK;c2c1~L3;" [list #.vector #.apply]) bq-process vector->list quote backquote *comma* any #function("8000v~\x8770c0\x7fK;e1c2\x7fKe3~31L142;" [list nconc list* bq-process]) lastcdr map #function(":000v^~F16902~Mc0<@6E02e1~M31\x7fKm12~Nm05\x0f/2c2~F6>0e3\x7f~\x86L1325J0~\x87:0e4\x7f315>0e3\x7fe5~31L132u42;" [*comma* bq-bracket #function("7000v~N\x8750~M;c0~K;" [nconc]) nreconc reverse! bq-process])])] bq-process) bq-bracket #function("8000r1~?6<0c0e1~31L2;~Mc2\x8490c0~\x86L2;~Mc3\x8490c4~\x86L2;~Mc5\x8450~\x86;c0e1~31L2;" [#.list bq-process *comma* *comma-at* copy-list *comma-dot*] bq-bracket) bcode:nconst #function("7000r1~b2[;" [] bcode:nconst) bcode:indexfor #function("9000r2c0e1~31e2~31u43;" [#function(":000ve0~\x8132690e1~\x8142;e2~\x81\x7f332\x7f\x80b2\x7fay\\2;" [has? get put!]) bcode:ctable bcode:nconst] bcode:indexfor) bcode:ctable #function("7000r1~a[;" [] bcode:ctable) bcode:code #function("7000r1~`[;" [] bcode:code) bcode:cdepth #function(":000r2~b3e0~b3[\x7f32\\;" [min] bcode:cdepth) assv #function("8000r2\x7f?640^;e0\x7f31~=650\x7fM;e1~\x7fN42;" [caar assv] assv) assoc #function("8000r2\x7f?640^;e0\x7f31~>650\x7fM;e1~\x7fN42;" [caar assoc] assoc) array? #function("8000r1~H17=02c0e1~31u42;" [#function("7000v~F16802~Mc0<;" [array]) typeof] array?) argc-error #function("=000r2e0e1c2~c3\x7f\x7faW670c4540c53541;" [error string "compile error: " " expects " " argument." " arguments."] argc-error) arg-counts #table(:not 1  :set-cdr! 2  :cons 2  :number? 1  :equal? 2  :cdr 1  :vector? 1  :eqv? 2  := 2  :div0 2  :atom? 1  :aref 2  :compare 2  :< 2  :null? 1  :eq? 2  :car 1  :set-car! 2  :builtin? 1  :aset! 3  :bound? 1  :boolean? 1  :pair? 1  :symbol? 1  :fixnum? 1) any #function("8000r2\x7fF16D02~\x7fM3117:02e0~\x7fN42;" [any] any) abs #function("7000r1~`X650~{;~;" [] abs) __start #function("8000r1e0302~NF6@0~Nk12e2~\x86315A0~k12e3e4312e5302e6`41;" [__init_globals *argv* __script princ *banner* repl exit] __start) __script #function("7000r1c0qc1t;" [#function("7000r0e0\x8041;" [load]) #function("7000r1e0~312e1a41;" [print-exception exit])] __script) __init_globals #function("7000r0c0c1<17B02c0c2<17802c0c3<6>0c4k52c6k75;0c8k52c9k72e:k;2e<k=2e>k?;" [linux win32 win64 windows "\\" *directory-separator* "\r\n" *linefeed* "/" "\n" *stdout* *output-stream* *stdin* *input-stream* *stderr* *error-stream*] __init_globals) Instructions #table(:sub2 74  :nop 0  :set-cdr! 32  :/ 37  :setc 63  :tapply 72  :lvargc 77  :cons 27  :loada1 79  :tcall.l 83  dummy_nil 93  :equal? 14  :cdr 30  :call 3  :eqv? 13  := 39  :setg.l 60  :list 28  :atom? 15  :aref 43  :load0 48  :let 70  dummy_t 91  :argc 66  :brne.l 85  :< 40  :null? 17  :loadg 53  :load1 49  :car 29  :brt.l 10  :vargc 67  :loada 55  :set-car! 31  :setg 59  :aset! 44  :loadc01 81  :bound? 21  :pair? 22  :symbol? 19  :brn 89  :fixnum? 25  :loadi8 50  :not 16  :* 36  :neg 75  :pop 2  :largc 76  :loadnil 47  :brf 6  :vector 42  :- 35  :loadv 51  :loada.l 56  :seta.l 62  :closure 65  :loadc00 80  :number? 20  :call.l 82  dummy_f 92  :trycatch 68  :add2 73  :loadv.l 52  :vector? 24  :brf.l 9  :seta 61  :apply 33  :dup 1  :div0 38  :setc.l 64  :copyenv 69  :for 71  :loada0 78  :loadc 57  :loadc.l 58  :compare 41  :brne 84  :brnn 87  :brn.l 90  :eq? 12  :function? 26  :+ 34  :jmp 5  :loadt 45  :cadr 86  :brt 7  :builtin? 23  :loadg.l 54  :tcall 4  :ret 11  :boolean? 18  :loadf 46  :brnn.l 88  :jmp.l 8) >= #function("7000r2\x7f~X17602~\x7fW;" [] >=) > #function("7000r2\x7f~X;" [] >) <= #function("7000r2~\x7fX17602~\x7fW;" [] <=) 1arg-lambda? #function("8000r1~F16T02~Mc0<16J02~NF16B02~\x86F16:02e1~\x86a42;" [lambda length=] 1arg-lambda?) 1- #function("7000r1~az;" [] 1-) 1+ #function("7000r1~ay;" [] 1+) /= #function("7000r2~\x7fW@;" [] /=) *whitespace* "\t\n\v\f\r \u0085  ᠎           \u2028\u2029  　" *syntax-environment* #table(assert #function("<000r1c0~]c1c2c3~L2L2L2L4;" [if raise quote assert-failed])  letrec #function("?000s1e0e0c1L1e2c3~32L1e2c4~32e5\x7f3134L1e2c6~3242;" [nconc lambda map #.car #function("9000r1e0c1L1e2~3142;" [nconc set! copy-list]) copy-list #function("6000r1^;" [])])  backquote #function("7000r1e0~41;" [bq-process])  label #function(":000r2c0~L1c1~\x7fL3L3^L2;" [lambda set!])  do #function("A000s2c0e130\x7fMe2c3~32e2e4~32e2c5~32u46;" [#function("B000vc0~c1g2c2\x7fe3c4L1e5\x81N3132e3c4L1e5i0231e3~L1g432L133L4L3L2L1e3~L1g332L3;" [letrec lambda if nconc begin copy-list]) gensym map #.car cadr #function("7000r1e0~31F680e1~41;~M;" [cddr caddr])])  when #function("<000s1c0~c1\x7fK^L4;" [if begin])  unwind-protect #function("9000r2c0e130e130u43;" [#function("@000vc0\x7fc1_\x81L3L2L1c2c3\x80c1~L1c4\x7fL1c5~L2L3L3L3\x7fL1L3L3;" [let lambda prog1 trycatch begin raise]) gensym])  dotimes #function("<000s1c0~M~\x86u43;" [#function("=000vc0`c1\x7faL3e2c3L1~L1L1e4\x813133L4;" [for - nconc lambda copy-list])])  define-macro #function("?000s1c0c1~ML2e2c3L1~NL1e4\x7f3133L3;" [set-syntax! quote nconc lambda copy-list])  receive #function("@000s2c0c1_\x7fL3e2c1L1~L1e3g23133L3;" [call-with-values lambda nconc copy-list])  unless #function("=000s1c0~^c1\x7fKL4;" [if begin])  let #function(";000s1c0^u42;" [#function("<000v\x80C6D0\x80m02\x81Mo002\x81No01530^2c0e1c2L1e3c4\x8032L1e5\x813133e3c6\x8032u43;" [#function("8000v\x806;0c0\x80~L3530~\x7fK;" [label]) nconc lambda map #function("6000r1~F650~M;~;" []) copy-list #function("6000r1~F650~\x86;^;" [])])])  cond #function(":000s0c0^u42;" [#function("7000vc0qm02~\x8041;" [#function("8000r1~?640^;c0~Mu42;" [#function(";000v~Mc0<17702~M]<6@0~N\x8750~M;c1~NK;~N\x87@0c2~Mi10\x80N31L3;c3~Mc1~NKi10\x80N31L4;" [else begin or if])] cond-clauses->if)])])  throw #function(":000r2c0c1c2c3L2~\x7fL4L2;" [raise list quote thrown-value])  time #function("8000r1c0e130u42;" [#function(">000vc0~c1L1L2L1c2\x80c3c4c5c1L1~L3c6L4L3L3;" [let time.now prog1 princ "Elapsed time: " - " seconds\n"]) gensym])  let* #function("A000s1~?6E0e0c1L1_L1e2\x7f3133L1;e0c1L1e3~31L1L1e2~NF6H0e0c4L1~NL1e2\x7f3133L1530\x7f3133e5~31L2;" [nconc lambda copy-list caar let* cadar])  case #function(";000s1c0^u42;" [#function("8000vc0m02c1e230u42;" [#function(";000r2\x7fc0\x8450c0;\x7f\x8740^;\x7fC6=0c1~e2\x7f31L3;\x7f?6=0c3~e2\x7f31L3;\x7fN\x87>0c3~e2\x7fM31L3;e4c5\x7f326=0c6~c7\x7fL2L3;c8~c7\x7fL2L3;" [else eq? quote-value eqv? every #.symbol? memq quote memv] vals->cond) #function("<000vc0~i10L2L1e1c2L1e3c4qi113232L3;" [let nconc cond map #function("8000r1i10\x80~M32~NK;" [])]) gensym])])  catch #function("8000r2c0e130u42;" [#function("@000vc0\x81c1~L1c2c3c4~L2c5c6~L2c7c8L2L3c5c9~L2\x80L3L4c:~L2c;~L2L4L3L3;" [trycatch lambda if and pair? eq car quote thrown-value cadr caddr raise]) gensym])) *banner* ";  _\n; |_ _ _ |_ _ |  . _ _\n; | (-||||_(_)|__|_)|_)\n;-------------------|----------------------------------------------------------\n\n")

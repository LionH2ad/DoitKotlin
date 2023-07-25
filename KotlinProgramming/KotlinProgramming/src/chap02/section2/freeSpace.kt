package chap02.section2

class freeSpace {
    /**
     * ctrl + shift + p 를 눌러 자료형을 추론하여 주석으로 추론된 자료형 적기
     * */
    val num05 = 127 // int형으로 추론
    val num06 = -32768 // int형으로 추론
    val num07 = 2147483647 // int형으로 추론
    val num08 = 9223372036854775807 // long형으로 추론

    val exp01 = 123 // int형으로 추론
    val exp02 = 123L // 접미사 L을 사용해 Long형으로 추론
    val exp03 = 0x0F // 접두사 0x를 사용해 16진수 표기가 사용된 Int형으로 추론
    val exp04 = 0b00001011 //접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론

    val exp08 : Byte = 127 // 명시적으로 자료형을 지정(Byte형)
    val exp09 = 32767 // 명시적으로 자료형을 지정하지 않으면 Short형 범위의 값도 Int형으로 추론
    val exp10 : Short = 32767 // 명시적으로 자료형을 지정(Short형)

    //부호가 없는 자료형
    val unit: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    //자릿값 구분 _
    val number = 1_000_000
    val cardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val exp001 = 3.14 // Double형으로 추론(기본)
    val exp002 = 3.14F // 식별자 F에 의해 Float형으로 추론
    val exp003 = 3.14E-2 // 왼쪽으로 소수점 2칸 이동, 0.0314
    val exp004 = 3.14e2 // 오른쪽으로 소수점 2칸 이동, 314
}
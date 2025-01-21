error id: file://<WORKSPACE>/src/main/scala/lw/Top.scala:[811..818) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/lw/Top.scala", "package lw

import chisel3._
import common.Consts._
import _root_.circt.stage.ChiselStage

class Top extends Module {
  val io = IO(new Bundle {
    val exit = Output(Bool())
    val gp   = Output(UInt(WORD_LEN.W))
  })
  
  val core   = Module(new Core())
  val memory = Module(new Memory())


  // //read instruction
  // memory.io.imem.addr := core.io.imem.addr
  // core.io.imem.inst := memory.io.imem.inst

  // //read data
  // memory.io.dmem.addr := core.io.dmem.addr
  // core.io.dmem.rdata := memory.io.dmem.rdata


  // //write back data
  // memory.io.dmem.wen := core.io.dmem.wen
  // memory.io.dmem.wdata := core.io.dmem.wdata


  core.io.imem <> memory.io.imem
  core.io.dmem <> memory.io.dmem
  
  io.exit := core.io.exit
  io.gp   := core.io.gp
}

object 
 extends App {
  val firtoolOptions = Array("--lowering-options=" + List(
    "disallowLocalVariables",
    "disallowPackedArrays",
    "locationInfoStyle=wrapInAtSquareBracket"
  ).reduce(_ + "," + _))
  circt.stage.ChiselStage.emitSystemVerilogFile(new lw.Top(), args, firtoolOptions)
}

object Top extends App {
  ChiselStage.emitSystemVerilogFile(
    new Top,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}")
file://<WORKSPACE>/file:<WORKSPACE>/src/main/scala/lw/Top.scala
file://<WORKSPACE>/src/main/scala/lw/Top.scala:39: error: expected identifier; obtained extends
 extends App {
 ^
#### Short summary: 

expected identifier; obtained extends